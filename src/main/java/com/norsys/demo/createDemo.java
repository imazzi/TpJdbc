package com.norsys.demo;

import com.norsys.models.DoFacture;
import com.norsys.services.FactureService;
import com.norsys.services.impl.FactureServiceImpl;
import com.norsys.util.DbConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class createDemo {
    public static void main(String[] args) {
        FactureService factureService = new FactureServiceImpl();


        //get all factures
        try {
            System.out.println(factureService.getAll());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //save facture
        DoFacture facture = new DoFacture(5, new Date(),2);
        try {

            System.out.println(factureService.save(facture));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //get facture by client
        try {

            System.out.println(factureService.getFacturesByIdClient(2));
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
