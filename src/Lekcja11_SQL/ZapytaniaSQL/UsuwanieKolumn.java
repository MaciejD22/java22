package Lekcja11_SQL.ZapytaniaSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuwanieKolumn {

    public static String url = "jdbc:postgresql://localhost/postgres";
    public static String user = "postgres";
    public static String password = "admin";



    private static final String addRecord = "ALTER TABLE pracownicy DROP COLUMN id_pracownika;";


    public static void main(String[] args) throws SQLException {
        UsuwanieKolumn usuwanieKolumn = new UsuwanieKolumn();
        usuwanieKolumn.usuwanieKolumn();
    }

    public void usuwanieKolumn() throws SQLException {
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
