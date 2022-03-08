package com.norsys.dto;

import java.util.Date;

public class DtoFacture {
    private Integer numFacture;
    private Date dateFacture;
    private Integer idClient;

    public DtoFacture() {
    }

    public DtoFacture(Integer numFacture, Date dateFacture, Integer idClient) {
        this.numFacture = numFacture;
        this.dateFacture = dateFacture;
        this.idClient = idClient;
    }
    public Integer getNumFacture() {
        return numFacture;
    }

    public void setNumFacture(Integer numFacture) {
        this.numFacture = numFacture;
    }

    public Date getDateFacture() {
        return dateFacture;
    }

    public void setDateFacture(Date dateFacture) {
        this.dateFacture = dateFacture;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }
}
