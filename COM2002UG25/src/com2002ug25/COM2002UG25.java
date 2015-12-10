package com2002ug25;

import java.sql.Statement;
import java.sql.Connection;
import static java.sql.Date.valueOf;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author fea13dw
 */
public class COM2002UG25 {
    private static String checkupRem;
    private static String hygieneRem;
    private static String repairRem;
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

public static void subscribePatient(String name, String number, String postcode, String plan, Connection con) throws SQLException{

 String planStartDate = getTodaysDate();
 
 Statement stmt = null;  
 try {
 stmt = (Statement) con.createStatement(); // create from open connection
 ResultSet res = stmt.executeQuery("SELECT coverage_checkup,coverage_hygiene,coverage_repair FROM plan WHERE name = '"+plan+"'");
 while (res.next()) {
  checkupRem = Integer.toString(res.getInt(1));
  hygieneRem = Integer.toString(res.getInt(2));
  repairRem = Integer.toString(res.getInt(3));
 }
 
 stmt.executeUpdate("UPDATE patients SET plan ='"+plan+"', plan_start_date = '"+planStartDate+"', rem_checkup = '"+checkupRem+"', rem_hygiene = '"+hygieneRem+"', rem_repair = '"+repairRem+"' WHERE number = '"+number+"' AND postcode = '"+postcode+"' AND name = '"+name+"'");

<<<<<<< HEAD
=======
}
catch (SQLException ex) {
 ex.printStackTrace();
}
finally {
 if (stmt != null) stmt.close();
}
}

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


>>>>>>> f1bae0a7bed35d3ab475d855c9ad85f29d1699eb
public static void main(String[] args) throws SQLException {
    String DB="jdbc:mysql://stusql.dcs.shef.ac.uk/team025?user=team025&password=a2dc8801";

    Connection con = null; 
    try { 
     con = DriverManager.getConnection(DB);
     System.out.println("connectsuccess");
    }
    catch (SQLException ex) {
     ex.printStackTrace();
    }
    /*
    finally {
    if (con != null) con.close();
    System.out.println("closed");
    }
    */
  
     java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patientreg().setVisible(true);
            }
        });
    
    registerPatient("Danny","1995-07-18","07889965789","86","S10 1NU","Maintenance", con);

<<<<<<< HEAD
=======
String DB="jdbc:mysql://stusql.dcs.shef.ac.uk/team025?user=team025&password=a2dc8801";

Connection con = null; 
try { 
 con = DriverManager.getConnection(DB);
 System.out.println("connectsuccess");
}
catch (SQLException ex) {
 ex.printStackTrace();
}

//registerAddress("16.6","Encliffe Vale Road","Endcliffe","Sheffield","S10 3EW",con);
registerPatient("Jonathan Gray","1993-05-21","07871632238","16.6","S10 3EW", con);
subscribePatient("Jonathan Gray","16.6","S10 3EW","Oral Health", con);
unsubscribePatient("Jonathan Gray","16.6","S10 3EW",con);



/*
finally {
 if (con != null) con.close();
 System.out.println("closing");
}
*/
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
 
>>>>>>> f1bae0a7bed35d3ab475d855c9ad85f29d1699eb
}
}  
