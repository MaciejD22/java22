package Lekcja11_SQL.ZapytaniaSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuwanieTabeli {

    public static String url = "jdbc:postgresql://localhost/postgres";
    public static String user = "postgres";
    public static String password = "admin";



    private static final String dropTable = "DROP TABLE pracownicy;";


    public static void main(String[] args) throws SQLException {
        UsuwanieTabeli usuwanieTabeli = new UsuwanieTabeli();
        usuwanieTabeli.usuwanieTabeli();
    }

    public void usuwanieTabeli() throws SQLException {
        System.out.println(dropTable);
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Połączo pomyślnie");
            Statement statement = connection.createStatement();
            statement.execute(dropTable);

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
