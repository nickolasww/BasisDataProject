/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basisdata;
import java.sql.*;

/**
 *
 * @author pinkg
 */
public class ConnectDB {
   public static void main(String[] args,int a) throws ClassNotFoundException, SQLException{
       String hostname = "localhost";
            String sqlInstanceName = " asd"; //computer name 
            String sqlDatabase = " asd";  //sql server database name
            String sqlUser = "sa";
            String sqlPassword = " asd"; //passwrod sa account

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            //jdbc:sqlserver://localhost:1433;instance=COMPUTERBERRY;databaseName=Database;
            String connectURL = "jdbc:sqlserver://" + hostname + ":1433" +";instance=" + sqlInstanceName + ";databaseName=" + sqlDatabase;

            Connection conn = DriverManager.getConnection(connectURL, sqlUser, sqlPassword);
            System.out.println("Connect to database successful!!"); 
    }
    
}
