package com.norsys.dto;

public class DtoProduitFacture {
    private Integer idArticle;
    private Integer numFacture;
    private Integer nbrArticleComande;

    public DtoProduitFacture(Integer idArticle, Integer numFacture, Integer nbrArticleComande) {
        this.idArticle = idArticle;
        this.numFacture = numFacture;
        this.nbrArticleComande = nbrArticleComande;
    }

    public Integer getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(Integer idArticle) {
        this.idArticle = idArticle;
    }

    public Integer getNumFacture() {
        return numFacture;
    }

    public void setNumFacture(Integer numFacture) {
        this.numFacture = numFacture;
    }

    public Integer getNbrArticleComande() {
        return nbrArticleComande;
    }

    public void setNbrArticleComande(Integer nbrArticleComande) {
        this.nbrArticleComande = nbrArticleComande;
    }
}
