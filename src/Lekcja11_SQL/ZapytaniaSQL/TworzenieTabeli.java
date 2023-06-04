package Lekcja11_SQL.ZapytaniaSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TworzenieTabeli {

    public static String url = "jdbc:postgresql://localhost/postgres";
    public static String user = "postgres";
    public static String password = "admin";



    private static final String createTable = "CREATE TABLE pracownicy (" +
            "imię VARCHAR(40) NOT NULL," +
            "nazwisko VARCHAR(50) NOT NULL, " +
            "pensja MONEY);";


    public static void main(String[] args) throws SQLException {
        TworzenieTabeli tworzenieTabeli = new TworzenieTabeli();
        tworzenieTabeli.tworzenieTabeli();
    }

    public void tworzenieTabeli() throws SQLException {
        System.out.println(createTable);
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Połączo pomyślnie");
            Statement statement = connection.createStatement();
            statement.execute(createTable);

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
