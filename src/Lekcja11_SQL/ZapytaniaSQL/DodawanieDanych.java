package Lekcja11_SQL.ZapytaniaSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DodawanieDanych {

    public static String url = "jdbc:postgresql://localhost/postgres";
    public static String user = "postgres";
    public static String password = "admin";



    private static final String addRecord = "INSERT INTO pracownicy(imię, nazwisko, pensja, wiek)" +
            "VALUES('Adam', 'Pieczarek', 3200.45, 45)," +
            "('Bartek', 'Rynkowski', 3654.45, 45)," +
            "('Celina', 'Adamczyk', 3800.45, 45);";


    public static void main(String[] args) throws SQLException {
        DodawanieDanych dodawanieDanych = new DodawanieDanych();
        dodawanieDanych.dodawanieDanych();
    }

    public void dodawanieDanych() throws SQLException {
        System.out.println(addRecord);
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Połączo pomyślnie");
            Statement statement = connection.createStatement();
            statement.execute(addRecord);

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
