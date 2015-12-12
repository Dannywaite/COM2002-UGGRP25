package com2002ug25;

import java.sql.Statement;
import java.sql.Connection;
import static java.sql.Date.valueOf;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.text.SimpleDateFormat;

/**
 *
 * @author fea13dw
 */
public class COM2002UG25 {
    private static int checkupRem;
    private static int hygieneRem;
    private static int repairRem;
    private static String patientId;
    private static int numberOfTreatments;
    private static String patientPlan;
    private static int modifiedTreatmentCost;
    public String name;
    public String bday;
    public String phoneno;
    public String housenum;
    public String postcode;
    public String plan;
    public Connection con;
    
public static void registerPatient(String name, String bday, String phoneno, String housenum, String postcode, Connection con) throws SQLException{
 
 Statement stmt = null;  
 try {
 stmt = (Statement) con.createStatement(); // create from open connection
 stmt.executeUpdate("INSERT INTO patients" + "(name, dob, contact, number, postcode, plan, plan_start_date, rem_checkup, rem_hygiene, rem_repair) VALUES ('"+name+"', '"+bday+"', '"+phoneno+ "', '"+housenum+"', '"+postcode+"', NULL, NULL, '0','0','0')");
}
catch (SQLException ex) {
 ex.printStackTrace();
}
finally {
 if (stmt != null) stmt.close();
}
}

//takes a patient's name, house number and postcode and a plan and subscribes them to it
public static void subscribePatient(String name, String number, String postcode, String plan, Connection con) throws SQLException{

 String planStartDate = getTodaysDate();
 
 Statement stmt = null;  
 try {
 stmt = (Statement) con.createStatement(); // create from open connection
 ResultSet res = stmt.executeQuery("SELECT coverage_checkup,coverage_hygiene,coverage_repair FROM plan WHERE name = '"+plan+"'");
 while (res.next()) {
  checkupRem = res.getInt(1);
  hygieneRem = res.getInt(2);
  repairRem = res.getInt(3);
 }
 stmt.executeUpdate("UPDATE patients SET plan ='"+plan+"', plan_start_date = '"+planStartDate+"', rem_checkup = '"+(Integer.toString(checkupRem))+"', rem_hygiene = '"+(Integer.toString(hygieneRem))+"', rem_repair = '"+(Integer.toString(repairRem))+"' WHERE number = '"+number+"' AND postcode = '"+postcode+"' AND name = '"+name+"'");
 }

catch (SQLException ex) {
 ex.printStackTrace();
}
finally {
 if (stmt != null) stmt.close();
}
}

//takes a patient's name, house number and post code and unsubscribes them from their healthplan.
public static void unsubscribePatient(String name, String number, String postcode, Connection con) throws SQLException {
 
 Statement stmt = null;  
 try {
 stmt = (Statement) con.createStatement(); // create from open connection 
 stmt.executeUpdate("UPDATE patients SET plan =NULL, plan_start_date = NULL, rem_checkup = '0', rem_hygiene = '0', rem_repair = '0' WHERE number = '"+number+"' AND postcode = '"+postcode+"' AND name = '"+name+"'");
}
catch (SQLException ex) {
 ex.printStackTrace();
}
finally {
 if (stmt != null) stmt.close();
}   
}

public static String getTodaysDate() {
    SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");
    Date today = new Date();
    String todaysDate = sdfDate.format(today);
    return todaysDate;
}

public static void registerAddress(String number, String street, String district, String city, String postcode, Connection con) throws SQLException{

 Statement stmt = null; 
 try {
 stmt = (Statement) con.createStatement(); // create from open connection
 stmt.executeUpdate("INSERT INTO address" + "(number, street, district, city, postcode) VALUES ('" +number+"', '"+street+"', '"+district+ "', '"+city+ "', '"+postcode+"')");  //('pls','1995-06-18','07889965789','86','S11 1NU', NULL)")
}
catch (SQLException ex) {
 ex.printStackTrace();
}
finally {
 if (stmt != null) stmt.close();
}
}

//takes a patient's name, house number and postcode. Creates list of outstanding treatment names, list of costs and total cost.
public static void reviewTreatments(String name, String number, String postcode, Connection con) throws SQLException{

 //get patientID   
 Statement stmt = null; 
 try {
 stmt = (Statement) con.createStatement(); // create from open connection
 String patientId = getPatientId(name,number,postcode,con);
 
 //get number of outstanding treatments for patient
 ResultSet res1 = stmt.executeQuery("SELECT count(*) FROM outstanding_treatments WHERE patientId = '"+patientId+"'");
 while (res1.next()) {
 numberOfTreatments = res1.getInt(1);
 }
 
 //create a list of the names of the treatments
 ResultSet res2 = stmt.executeQuery("SELECT name FROM outstanding_treatments WHERE patientId = '"+patientId+"'");
 ArrayList <String> listOfTreatmentNames = new ArrayList();
 while (res2.next()) {
     for (int i=1; i<(numberOfTreatments+1); i++)
        listOfTreatmentNames.add(res2.getString(i));
 }
 
 //create a list of the costs of the treatments
 ArrayList <Integer> listOfTreatmentCosts = new ArrayList();
 for (int i = 0; i<numberOfTreatments; i++){
     String tName = listOfTreatmentNames.get(i);
     ResultSet res = stmt.executeQuery("SELECT cost FROM treatments WHERE name = '"+tName+"'");
     while (res.next()) {
        listOfTreatmentCosts.add(res.getInt(1));
 }
 }
 
//display treatments with costs and total cost
 int totalTreatmentCost = listOfTreatmentCosts.stream().mapToInt(Integer::intValue).sum();
 System.out.println ("Treatments: "+listOfTreatmentNames);
 System.out.println ("Costs: "+listOfTreatmentCosts);
 System.out.println ("Total: "+totalTreatmentCost);
 
 //if patient doesnt't have a plan then treatment cost remains the same
 ResultSet res4 = stmt.executeQuery("SELECT plan FROM patients WHERE patientId = '"+patientId+"'");
 while (res4.next()) {
 patientPlan = res4.getString(1);
 }
 
 if ("NULL".equals(patientPlan)){
     int modifiedTreatmentCost = totalTreatmentCost;
    }
 
 //create list of the treatment types
 ArrayList <String> listOfTreatmentTypes = new ArrayList();
 for (int i = 0; i<numberOfTreatments; i++){
     String tName = listOfTreatmentNames.get(i);
     ResultSet res = stmt.executeQuery("SELECT type FROM treatments WHERE name = '"+tName+"'");
     while (res.next()) {
        listOfTreatmentTypes.add(res.getString(1));
 }
 }
 
 //create a list of the treatment IDs 
 ArrayList <Integer> listOfTreatmentIds = new ArrayList();
 ResultSet res5 = stmt.executeQuery("SELECT treatmentId FROM outstanding_treatments WHERE patientId = '"+patientId+"'");
 while (res5.next()) {
     for (int i=1; i<(numberOfTreatments+1); i++)
        listOfTreatmentIds.add(res5.getInt(i));
 }
  
 //create a full detailed list of the treatments (possible to do first then use get methods? I don't know how yet)
 ArrayList <Treatment> fullTreatmentList = new ArrayList();
 for (int i=0; i<numberOfTreatments; i++){
     int d = listOfTreatmentIds.get(i);
     String n = listOfTreatmentNames.get(i);
     String t = listOfTreatmentTypes.get(i);
     int c = listOfTreatmentCosts.get(i);
     fullTreatmentList.add(new Treatment(d, n, t, c));
   }
 
 //get remaining coverage for the patient
 ResultSet res6 = stmt.executeQuery("SELECT rem_checkup, rem_hygiene, rem_repair FROM patients WHERE patientId = '"+patientId+"'");
 while (res6.next()) {
  checkupRem = res6.getInt(1);
  hygieneRem = res6.getInt(2);
  repairRem = res6.getInt(3);
 }
 
 //create lists of treatments left to pay and treatments to remove from the database
 int numberOfFreeTreatments = checkupRem+hygieneRem+repairRem;
 ArrayList <Integer> listOfCostsOfTreatmentsToPay = new ArrayList();
 ArrayList <Integer> listOfTreatmentsToRemove = new ArrayList();
 for (int i=0; i<numberOfFreeTreatments; i++){
     Treatment t = fullTreatmentList.get(i);
     String type = t.getType();
     int c = t.getCost();
     int d = t.getTreatmentId();
     switch (type) {
            case "Checkup": if (checkupRem>0) {
                checkupRem--;
                listOfTreatmentsToRemove.add(d);
            }else{
                listOfCostsOfTreatmentsToPay.add(c);   
            };
            break;
            case "Hygiene": if (hygieneRem>0) {
                hygieneRem--;
                listOfTreatmentsToRemove.add(d);
            }else{
                listOfCostsOfTreatmentsToPay.add(c);   
            };
            break;
            case "Repair": if (repairRem>0) {
                repairRem--;
                listOfTreatmentsToRemove.add(d);
            }else{
                listOfCostsOfTreatmentsToPay.add(c);   
            };
            break;
            default: System.out.println("Invalid treatment type detected");
            break;
        }
 }
 
 //update remaining coverage values
 stmt.executeUpdate("UPDATE patients SET rem_checkup = '"+(Integer.toString(checkupRem))+"', rem_hygiene = '"+(Integer.toString(hygieneRem))+"', rem_repair = '"+(Integer.toString(repairRem))+"' WHERE patientId = '"+patientId+"'");
 
 //remove treatments that are paid for by coverage
 for (int i=0; i<listOfTreatmentsToRemove.size(); i++){
     String d = Integer.toString(listOfTreatmentsToRemove.get(i));
     stmt.executeUpdate("DELETE FROM outstanding_treatments WHERE treatmentId = '"+d+"'");   
 }
 
 //compute new treatment cost
 int modifiedTreatmentCost = listOfCostsOfTreatmentsToPay.stream().mapToInt(Integer::intValue).sum(); 
 
 System.out.println ("Total inc. plan coverage: "+modifiedTreatmentCost);
}

catch (SQLException ex) {
 ex.printStackTrace();
}
finally {
 if (stmt != null) stmt.close();
}
}

public static void patientPaid (String name, String number, String postcode, Connection con) throws SQLException{
  
Statement stmt = null;
try {
 //get patientID
 stmt = (Statement) con.createStatement();
 String patientId = getPatientId(name,number,postcode,con);
 //delete all outstanding treatments for the patient
 stmt.executeUpdate("DELETE FROM outstanding_treatments WHERE patientId = '"+patientId+"'");
}
catch (SQLException ex) {
 ex.printStackTrace();
}
finally {
 if (stmt != null) stmt.close();
}     
}

public static void addTreatment (String name, String houseno, String postcode, String treatmentName, Connection con){
Statement stmt = null;
try {
 //get patientID
 stmt = (Statement) con.createStatement();
 String patientId = getPatientId(name,houseno,postcode,con);
 
 //get todays date
 String today = getTodaysDate();
 
 //add treatment
 stmt.executeUpdate("INSERT INTO outstanding_treatments (patientId, name, date) VALUES ('" +patientId+"', '"+treatmentName+"', '"+today+"')"); 
 
}
catch (SQLException ex) {
 ex.printStackTrace();
}
finally {
 if (stmt != null) stmt.close();
}     
}

public static String getPatientId (String name, String houseno, String postcode, Connection con) throws SQLException{
 Statement stmt = null;
try {
 stmt = (Statement) con.createStatement();
 ResultSet res1 = stmt.executeQuery("SELECT patientId FROM patients WHERE name = '"+name+"' AND number = '"+houseno+"' AND postcode = '"+postcode+"'");
 while (res1.next()) {
 patientId = Integer.toString(res1.getInt(1));
 }
}
catch (SQLException ex) {
 ex.printStackTrace();
}
finally {
 if (stmt != null) stmt.close();
}
return patientId;
} 

public static void main(String[] args) throws SQLException {
    String DB="jdbc:mysql://stusql.dcs.shef.ac.uk/team025?user=team025&password=a2dc8801";

    Connection con = null; 
    
try { 
con = DriverManager.getConnection(DB);
System.out.println("connectsuccess");

     java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patientreg().setVisible(true);
            }
        });
 
//registerAddress("16.6","Endcliffe Vale Road","Endcliffe","Sheffield","S10 3EW",con);
registerPatient("Jonathan Gray","1993-05-21","07871632238","16.6","S10 3EW", con);
subscribePatient("Jonathan Gray","16.6","S10 3EW","Oral Health", con);
unsubscribePatient("Jonathan Gray","16.6","S10 3EW",con);

}
catch (SQLException ex) {
 ex.printStackTrace();
}

finally {
 if (con != null) con.close();
 System.out.println("closing");
}

/*
String name = "Danny";
String bday = "1995";
String phoneno = "hello";
String housenum = "455";
String postcode = "123";
String plan = "twatS";
System.out.println(name+"', '"+bday+"', '"+phoneno+ "', '"+housenum+"', '"+postcode+"', '"+plan);
*/     
/*
Statement stmt = null; 
try {
 stmt = (Statement) con.createStatement(); // create from open connection
 int count = stmt.executeUpdate("INSERT INTO patients" + "(name, dob, contact, number, postcode, plan) VALUES ('pls','1995-06-18','07889965789','86','S11 1NU', NULL)");

}
catch (SQLException ex) {
 ex.printStackTrace();
}
finally {
 if (stmt != null) stmt.close();
}
*/

//Date date = valueOf("1995-07-18"); // format: valueOf(String) where string is yyyy-mm-dd
//System.out.println(date.toString());
//Patient person = new Patient("Danny", "1995-07-18", "7889965789", 60, "s6 3gp", "fuck off");

//System.out.println(person.toString());
 
}
}  
