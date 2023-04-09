package com.example.hall_management;

import java.sql.Connection;
import java.sql.DriverManager;
public class DatabaseConnection {
    public Connection databaselink;
    public Connection getconnection(){
        String databaseName="";
        String databaseUser="";
        String databasePassword="";
        String url="jbdc:mysql://localhost/"+databaseName;
    }

}
