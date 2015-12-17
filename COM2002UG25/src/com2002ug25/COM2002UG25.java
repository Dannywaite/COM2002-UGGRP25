package com2002ug25;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

/**
 * Main for initialising the menu and some helper methods
 * @author fea13dw
 */
public class COM2002UG25 {
    private static String patientId;
    public String name;
    public String bday;
    public String phoneno;
    public String housenum;
    public String postcode;
    public String plan;
    public Connection con;

public static String getTodaysDate() {
    SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");
    Date today = new Date();
    String todaysDate = sdfDate.format(today);
    return todaysDate;
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
System.out.println("Patient ID: "+patientId);
return patientId;
}

public static void main(String[] args) throws SQLException, ParseException {
    String DB="jdbc:mysql://stusql.dcs.shef.ac.uk/team025?user=team025&password=a2dc8801";

    Connection con = null; 
    
try { 
con = DriverManager.getConnection(DB);
System.out.println("connectsuccess");

     java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menucal().setVisible(true);
            }
        });
}
catch (SQLException ex) {
 ex.printStackTrace();
}

finally {
 if (con != null) con.close();
 System.out.println("closing");
}
 
}
}  
