package Lekcja11_SQL.ZapytaniaSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ModyfikowanieDanych {

    public static String url = "jdbc:postgresql://localhost/postgres";
    public static String user = "postgres";
    public static String password = "admin";



    private static final String modyfikowanieDanych = "UPDATE pracownicy SET pensja = 2230.80 WHERE id_pracownika = 3;";


    public static void main(String[] args) throws SQLException {
        ModyfikowanieDanych modyfikowanieDanych1 = new ModyfikowanieDanych();
        modyfikowanieDanych1.modyfikowanieDanych();
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
