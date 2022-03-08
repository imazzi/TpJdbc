package com.norsys.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private Connection connexion;
    private static DbConnection instance;




    private DbConnection (){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            this.connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/magasin", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }



    }

    public Connection getConnexion() {
        return connexion;
    }

    public static  DbConnection getInstance() throws SQLException {
        if(instance ==null){
            instance= new DbConnection();
        }else if(instance.getConnexion().isClosed()){
            instance= new DbConnection();
        }

        return instance;
    }


}
