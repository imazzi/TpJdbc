package com.norsys.beans;

public class DoClient {
    private Integer idClient;
    private  String nom;
    private String prenom;

    public DoClient() {
    }

    public DoClient(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Integer  getIdClient() {
        return idClient;
    }

    public void setIdClient( Integer idClient) {
        this.idClient = idClient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}