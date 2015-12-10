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
    
public static void registerPatient(String name, String bday, String phoneno, String housenum, String postcode, String plan, Connection con) throws SQLException{
    name = name;
    bday = bday;
    phoneno = phoneno;
    housenum = housenum;
    postcode = postcode;
    plan = plan;
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
 

 int count = stmt.executeUpdate("INSERT INTO patients" + "(name, dob, contact, number, postcode, plan, plan_start_date, rem_checkup, rem_hygiene, rem_repair) VALUES ('"+name+"', '"+bday+"', '"+phoneno+ "', '"+housenum+"', '"+postcode+"', '"+plan+"', '"+planStartDate+"', '"+checkupRem+"', '"+hygieneRem+"', '"+repairRem+"')");

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
    number = number;
    street = street;
    city = city;
    postcode = postcode;
 Statement stmt = null; 
 try {
 stmt = (Statement) con.createStatement(); // create from open connection
 int count = stmt.executeUpdate("INSERT INTO address" + "(number, street, district, city, postcode) VALUES ('" +number+"', '"+street+"', '"+district+ "', '"+city+ "', '"+postcode+"')");  //('pls','1995-06-18','07889965789','86','S11 1NU', NULL)")

}
catch (SQLException ex) {
 ex.printStackTrace();
}
finally {
 if (stmt != null) stmt.close();
}
}








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

registerPatient("Danny","1995-07-18","07889965789","86","S10 1NU","Maintenance", con);
//registerAddress("1231a","Mappin Street","adsdasd","Sheffield","S1 1AA",con);


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
 
}
}  