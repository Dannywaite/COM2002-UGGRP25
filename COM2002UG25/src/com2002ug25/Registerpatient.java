/*
package com2002ug25;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
public class Registerpatient {   
    public String name;
    public String bday;
    public String phoneno;
    public String housenum;
    public String postcode;
    public String plan;
    public Connection con;
    
public void registerPatient(String name, String bday, String phoneno, String housenum, String postcode, String plan, Connection con) throws SQLException{
    this.name = name;
    this.bday = bday;
    this.phoneno = phoneno;
    this.housenum = housenum;
    this.postcode = postcode;
    this.plan = plan;
 Statement stmt = null; 
 try {
 stmt = (Statement) con.createStatement(); // create from open connection
 int count = stmt.executeUpdate("INSERT INTO patients" + "(name, dob, contact, number, postcode, plan) VALUES ('" +name+"', '"+bday+"', '"+phoneno+ "', '"+housenum+"', '"+postcode+"', '"+plan);  //('pls','1995-06-18','07889965789','86','S11 1NU', NULL)")

}
catch (SQLException ex) {
 ex.printStackTrace();
}
finally {
 if (stmt != null) stmt.close();
}
}
/*
    public Patient(String n, String bday, String pno, int hnum, String pcode, String p){
        name = n;
        this.bday = bday;
        phoneno= pno;
        housenum= hnum;
        postcode = pcode;
        plan = p;
    }


    public String toString() {
        return "Patient{" + "name=" + name + ", bday=" + bday + ", phoneno=" + phoneno + ", housenum=" + housenum + ", postcode=" + postcode + ", plan=" + plan + '}';
    }

 
 
    
    //get method
    
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    
    public String getName() {
        return name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public int getPhoneno() {
        return phoneno;
    }

    public int getHousenum() {
        return housenum;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getPlan() {
        return plan;
    }
    
*/

