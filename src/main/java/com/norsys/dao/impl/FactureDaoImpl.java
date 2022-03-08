package com.norsys.dao.impl;

import com.norsys.models.DoFacture;
import com.norsys.dao.FactureDao;
import com.norsys.util.DbConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FactureDaoImpl implements FactureDao {

    @Override
    public List<DoFacture> getAll() {
        Connection connexion;
        Statement statement;
        ResultSet resultat;
        DoFacture doFacture = new DoFacture();
        List<DoFacture> doFactureList = new ArrayList<>();

        try {
            DbConnection dbConnection = DbConnection.getInstance();
            connexion = dbConnection.getConnexion();
            statement = connexion.createStatement();
            resultat = statement.executeQuery("SELECT num_facture, date_facture FROM facture;");

            while (resultat.next()) {
                doFacture.setNumFacture(resultat.getInt("num_facture"));
                doFacture.setDateFacture(resultat.getDate("date_facture"));
                doFactureList.add(doFacture);
            }
            resultat.close();
            statement.close();
            connexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return doFactureList;
    }

    @Override
    public List<DoFacture> getFacturesByIdClient(Integer idClient) {
        Connection connexion;
        Statement statement;
        ResultSet resultat;
        DoFacture doFacture = new DoFacture();
        List<DoFacture> doFactureList = new ArrayList<>();

        try {
            DbConnection dbConnection = DbConnection.getInstance();
            connexion = dbConnection.getConnexion();
            statement = connexion.createStatement();
            resultat = statement.executeQuery("SELECT num_facture, date_facture FROM facture WHERE facture.id_client= "+idClient+";");

            while (resultat.next()) {
                doFacture.setNumFacture(resultat.getInt("num_facture"));
                doFacture.setDateFacture(resultat.getDate("date_facture"));
                doFactureList.add(doFacture);
            }
            resultat.close();
            statement.close();
            connexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return doFactureList;
    }

    @Override
    public DoFacture save(DoFacture facture) {
        Connection connexion;
        Statement statement;
        ResultSet resultat;
        DoFacture doFacture = new DoFacture();
        Integer num = facture.getNumFacture();
        Date date = facture.getDateFacture();
        Integer idClient = facture.getIdClient();

        try {
            DbConnection dbConnection = DbConnection.getInstance();
            connexion = dbConnection.getConnexion();
            statement = connexion.createStatement();

            statement.executeUpdate("INSERT INTO facture (num_facture, date_facture, id_client) VALUES (num, date, idClient);");

            statement.close();
            connexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return doFacture;
    }
}
