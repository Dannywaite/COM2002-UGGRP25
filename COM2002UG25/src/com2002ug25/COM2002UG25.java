package com2002ug25;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author fea13dw
 */
public class COM2002UG25 {

public static void main(String[] args) throws SQLException {

String DB="jdbc:mysql://stusql.dcs.shef.ac.uk/team025?user=team025&password=a2dc8801";

Connection con = null; 
try { 
 con = DriverManager.getConnection(DB);
}
catch (SQLException ex) {
 ex.printStackTrace();
}
finally {
 if (con != null) con.close();
}
    
 
}
}  