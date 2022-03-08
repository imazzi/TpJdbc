package com.norsys.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static String url="jdbc:h2:file:D:/pfe/NorsysFormationWorkspace/TpJDBC/database/DB_TP_JDBC.script";
    private static String username = "SA";
    private static String password = "";


    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return DriverManager.getConnection(url, username, password);
    }


}
