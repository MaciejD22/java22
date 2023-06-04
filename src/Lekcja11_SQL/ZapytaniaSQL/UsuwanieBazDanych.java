package Lekcja11_SQL.ZapytaniaSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuwanieBazDanych {

    public static String url = "jdbc:postgresql://localhost/postgres";
    public static String user = "postgres";
    public static String password = "admin";



    private static final String createDB = "DROP DATABASE testowaDB;";


    public static void main(String[] args) throws SQLException {
        UsuwanieBazDanych usuwanieBazDanych = new UsuwanieBazDanych();
        usuwanieBazDanych.usuwanieDB();
    }

    public void usuwanieDB() throws SQLException {
        System.out.println(createDB);
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Połączo pomyślnie");
            Statement statement = connection.createStatement();
            statement.execute(createDB);

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
