package Utilities;

import java.sql.*;
import java.util.ArrayList;

public class DBUtility {
    private static Connection connection;
    private static Statement statement;


    public static void DBConnectionOpen() {
        //Bağlantı işlemleri
        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila"; //hostname,port,db name(use db)
        String username = "root";//Username
        String password = "'\"-LhCB'.%k[4S]z";//Password
        try {
            connection = DriverManager.getConnection(url, username, password); //Connection
            statement = connection.createStatement(); //Sorguları çalıştırmak için page açıldı.
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void DBConnectionClose() {
        //Close İşlemleri
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<ArrayList<String>> getDataList(String query) {
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        DBConnectionOpen();
        try {
            ResultSet rs = statement.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();

            ArrayList<String> satır1=new ArrayList<>();
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                satır1.add(rsmd.getColumnName(i));
            }
            list.add(0,satır1);
            System.out.println();
            int sayac=1;
            while (rs.next()) {
                ArrayList<String> satır=new ArrayList<>();
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    satır.add(rs.getString(i));
                }
                list.add(sayac,satır);
                sayac++;
                System.out.println();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        DBConnectionClose();
        return list;
    }


}
