package com.norsys.dao.impl;

import com.norsys.models.DoFacture;
import com.norsys.dao.FactureDao;
import com.norsys.util.DbConnection;

import java.sql.*;
import java.util.ArrayList;
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
            resultat = statement.executeQuery("SELECT num_facture, date_facture , id_client FROM facture;");

            while (resultat.next()) {
                doFacture.setNumFacture(resultat.getInt("num_facture"));
                doFacture.setDateFacture(resultat.getDate("date_facture"));
                doFacture.setIdClient(resultat.getInt("id_client"));
                doFactureList.add(doFacture);
            }
            resultat.close();
            statement.close();
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
    public int save(DoFacture facture) {
        Connection connexion;

        try {
            DbConnection dbConnection = DbConnection.getInstance();
            connexion = dbConnection.getConnexion();
            PreparedStatement statement=connexion.prepareStatement("INSERT INTO facture (num_facture, date_facture, id_client) VALUES (?, ?, ?);");
            statement.setInt(1,facture.getNumFacture());
            statement.setDate(2, new Date(facture.getDateFacture().getTime()));
            statement.setInt(3, facture.getIdClient());

            int result =statement.executeUpdate();
            statement.close();
            return  result;
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
