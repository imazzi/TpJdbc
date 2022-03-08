package com.norsys.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private String url;
    private String username;
    private String password;

    DbConnection(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public static DbConnection getInstance() {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {

        }

        DbConnection instance = new DbConnection("jdbc:h2:file:D:/pfe/NorsysFormationWorkspace/TpJDBC/database/DB_TP_JDBC.script", "SA", "");
        return instance;
    }

    public  Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }


}
