package com.norsys.models;

public class DoArticle {
    private Integer idArticle;
    private String nom;
    private double prix;

    public DoArticle() {
    }


    public Integer getId() {
        return idArticle;
    }

    public void setId(Integer id) {
        this.idArticle = idArticle;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
