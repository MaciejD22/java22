package Lekcja11_SQL.ZapytaniaSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuwanieDanych {

    public static String url = "jdbc:postgresql://localhost/postgres";
    public static String user = "postgres";
    public static String password = "admin";



    private static final String usuwanieDanych = "DELETE FROM pracownicy WHERE imię = 'Adam';";


    public static void main(String[] args) throws SQLException {
        UsuwanieDanych usuwanieDanych1 = new UsuwanieDanych();
        usuwanieDanych1.usuwanieDanych();
    }

    public void usuwanieDanych() throws SQLException {
        System.out.println(usuwanieDanych);
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Połączo pomyślnie");
            Statement statement = connection.createStatement();
            statement.execute(usuwanieDanych);

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
