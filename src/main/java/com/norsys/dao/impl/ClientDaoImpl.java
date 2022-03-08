package com.norsys.dao.impl;

import com.norsys.models.DoClient;
import com.norsys.dao.ClientDao;
import com.norsys.util.DbConnection;

import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClientDaoImpl implements ClientDao {
    Connection connexion = null;
    Statement statement = null;
    ResultSet resultat = null;

    public ClientDaoImpl() {
    }

    @Override
    public int update(DoClient client) throws SQLException{
        try {
            DbConnection dbConnection = DbConnection.getInstance();
            connexion = dbConnection.getConnexion();

            PreparedStatement stmt = connexion.prepareStatement("update client set nom=? , prenom=? where id_client=?");
            stmt.setString(1, client.getNom());
            stmt.setString(2, client.getPrenom());
            stmt.setInt(3, client.getIdClient());

            int result = stmt.executeUpdate();
            resultat.close();
            statement.close();
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public List<DoClient> getAll() throws SQLException {

        List<DoClient> clients = new ArrayList<>();
        DbConnection dbConnection = DbConnection.getInstance();
        connexion = dbConnection.getConnexion();
        statement = connexion.createStatement();
        resultat = statement.executeQuery("SELECT nom, prenom FROM client;");

        while (resultat.next()) {
            DoClient client = new DoClient();
            client.setNom(resultat.getString("nom"));
            client.setPrenom((resultat.getString("prenom")));
            clients.add(client);
        }
        resultat.close();
        statement.close();

        return clients;
    }
}
