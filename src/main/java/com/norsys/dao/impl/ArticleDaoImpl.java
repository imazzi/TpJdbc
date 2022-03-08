package com.norsys.dao.impl;

import com.norsys.models.DoArticle;
import com.norsys.dao.ArticleDao;
import com.norsys.models.DoClient;
import com.norsys.util.DbConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ArticleDaoImpl implements ArticleDao {

    public ArticleDaoImpl() {
    }

    @Override
    public DoArticle getById(Integer idArticle) {
        DoArticle article = new DoArticle();
        Connection connexion = null;
        Statement statement = null;
        ResultSet resultat = null;


        try {
            DbConnection dbConnection = DbConnection.getInstance();
            connexion = dbConnection.getConnexion();
            statement = connexion.createStatement();
            resultat = statement.executeQuery("SELECT nom, prix FROM article where id = idArticle ;");

            while (resultat.next()) {
                String nom = resultat.getString("nom");
                double prix = resultat.getDouble("prix");

                article.setNom(nom);
                article.setPrix(prix);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return article;    }

    @Override
    public List<DoArticle> getAll() {
        List<DoArticle > articles =new ArrayList<>();
        Connection connexion = null;
        Statement statement = null;
        ResultSet resultat = null;


        try {
            DbConnection dbConnection = DbConnection.getInstance();
            connexion = dbConnection.getConnexion();
            statement = connexion.createStatement();
            resultat = statement.executeQuery("SELECT nom, prix FROM article;");

            while (resultat.next()) {
                String nom = resultat.getString("nom");
                double prix = resultat.getDouble("prix");

                DoArticle article = new DoArticle();
                article.setNom(nom);
                article.setPrix(prix);

                articles.add(article);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return articles;
    }

}
