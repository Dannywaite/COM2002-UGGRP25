package com2002ug25;

import java.sql.Statement;
import java.sql.Connection;
import static java.sql.Date.valueOf;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author fea13dw
 */
public class COM2002UG25 {
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
 Statement stmt = null; 
 try {
 stmt = (Statement) con.createStatement(); // create from open connection
 int count = stmt.executeUpdate("INSERT INTO patients" + "(name, dob, contact, number, postcode, plan) VALUES ('" +name+"', '"+bday+"', '"+phoneno+ "', '"+housenum+"', '"+postcode+"', '"+plan+"')");  //('pls','1995-06-18','07889965789','86','S11 1NU', NULL)")

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

}
}  
