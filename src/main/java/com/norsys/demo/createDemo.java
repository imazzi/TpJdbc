package com.norsys.demo;

import com.mysql.cj.xdevapi.Client;
import com.norsys.models.DoClient;
import com.norsys.models.DoFacture;
import com.norsys.services.ArticleService;
import com.norsys.services.ClientService;
import com.norsys.services.FactureService;
import com.norsys.services.impl.ArticleServiceImpl;
import com.norsys.services.impl.ClientServiceImpl;
import com.norsys.services.impl.FactureServiceImpl;
import com.norsys.util.DbConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class createDemo {
    public static void main(String[] args) {
        ClientService clientService = new ClientServiceImpl();
        ArticleService articleService = new ArticleServiceImpl();
        FactureService factureService = new FactureServiceImpl();
        Scanner scanner = new Scanner(System.in);

        //getAll clients
//        try {
//            System.out.println(clientService.getAll());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        //update client
        DoClient client = new DoClient(5, "Imane", "Lol");

//        try {
//            System.out.println(clientService.update(client));
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        System.out.println("Bienvenue");
        System.out.println("Pour choisir une option cliquer sur son numéro");
        System.out.println("1.Lister les articles");
        System.out.println("2.Lister les factures");
        System.out.println("3.Lister les clients");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println(articleService.getAll());
            case 2:
                try {
                    System.out.println(factureService.getAll());
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            case 3:
                try {
                    System.out.println(clientService.getAll());
                    System.out.println("1.Lister les factures");
                    System.out.println("2.Ajouter une facture");
                    System.out.println("3.Modifier le client");
                    int option2 = scanner.nextInt();
                    switch (option2) {
                        case 1:
                            System.out.println(articleService.getAll());
                        case 2:
                            DoFacture facture = new DoFacture();
                            System.out.println("Saisissez les informations de cette facture");
                            System.out.println("Numéro facture");
                            facture.setNumFacture(scanner.nextInt());
                            System.out.println("Id client");
                            facture.setIdClient(scanner.nextInt());
                            System.out.println("Date");
                            String dateFacture = scanner.next();
                            facture.setDateFacture(new SimpleDateFormat("dd/MM/yyyy").parse(dateFacture));
                            // factureService.save();

                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                } catch (ParseException e) {
                    e.printStackTrace();
                }

        }
    }
}