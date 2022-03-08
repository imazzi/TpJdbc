package com.norsys.demo;

import com.norsys.util.DbConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class createDemo {
    public static void main(String[] args) {
        DbConnection daoFactory = DbConnection.getInstance();
        Connection connexion = null;
        Statement statement = null;
        ResultSet resultat = null;

        try {
            System.out.println("start");
            connexion = daoFactory.getConnection();
            statement = connexion.createStatement();
            resultat = statement.executeQuery("SELECT nom, prenom FROM client;");

            while (resultat.next()) {
                String nom = resultat.getString("nom");
                String prenom = resultat.getString("prenom");
                System.out.println("Client: "+nom+" "+prenom);
            }
            resultat.close();
            statement.close();
            connexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}