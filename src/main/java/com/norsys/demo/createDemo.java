package com.norsys.demo;

import com.mysql.cj.xdevapi.Client;
import com.norsys.models.DoClient;
import com.norsys.services.ArticleService;
import com.norsys.services.ClientService;
import com.norsys.services.impl.ArticleServiceImpl;
import com.norsys.services.impl.ClientServiceImpl;
import com.norsys.util.DbConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class createDemo {
    public static void main(String[] args) {
         ClientService clientService = new ClientServiceImpl();
        ArticleService articleService = new ArticleServiceImpl();

         //getAll clients
        try {
            System.out.println(clientService.getAll());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //update client
        DoClient client = new DoClient(5,"Imane","Lol");

//        try {
//            System.out.println(clientService.update(client));
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        System.out.println(articleService.getById(1));
    }
}
