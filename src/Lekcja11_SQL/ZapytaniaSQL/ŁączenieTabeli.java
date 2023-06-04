package Lekcja11_SQL.ZapytaniaSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ŁączenieTabeli {

    public static String url = "jdbc:postgresql://localhost/postgres";
    public static String user = "postgres";
    public static String password = "admin";



    private static final String modyfikowanieDanych = "SELECT" +
            " a," +
            "owoc_a," +
            "b," +
            "owoc_b " +
            "FROM koszyk_a INNER JOIN koszyk_b ON owoc_a = owoc_b;";


    public static void main(String[] args) throws SQLException {
        ŁączenieTabeli łączenieTabeli = new ŁączenieTabeli();
        łączenieTabeli.modyfikowanieDanych();
    }

    public void modyfikowanieDanych() throws SQLException {
        System.out.println(modyfikowanieDanych);
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Połączo pomyślnie");
            Statement statement = connection.createStatement();
            statement.execute(modyfikowanieDanych);

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
