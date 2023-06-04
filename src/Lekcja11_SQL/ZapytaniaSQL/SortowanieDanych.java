package Lekcja11_SQL.ZapytaniaSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SortowanieDanych {

    public static String url = "jdbc:postgresql://localhost/postgres";
    public static String user = "postgres";
    public static String password = "admin";



    private static final String sortowanieDanych = "SELECT imię FROM pracownicy ORDER BY pensja;" +
            "SELECT * FROM pracownicy;";


    public static void main(String[] args) throws SQLException {
        SortowanieDanych sortowanieDanych1 = new SortowanieDanych();
        sortowanieDanych1.setSortowanieDanych();
    }

    public void setSortowanieDanych() throws SQLException {
        System.out.println(sortowanieDanych);
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Połączo pomyślnie");
            Statement statement = connection.createStatement();
            statement.execute(sortowanieDanych);


        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
