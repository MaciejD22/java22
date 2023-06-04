package Lekcja11_SQL.ZapytaniaSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DodawanieKolumn {

    public static String url = "jdbc:postgresql://localhost/postgres";
    public static String user = "postgres";
    public static String password = "admin";



    private static final String addRecord = "ALTER TABLE pracownicy ADD id SERIAL;" +
            "ALTER TABLE pracownicy ADD PRIMARY KEY (id);";


    public static void main(String[] args) throws SQLException {
        DodawanieKolumn dodawanieKolumn = new DodawanieKolumn();
        dodawanieKolumn.dodawanieKolumn();
    }

    public void dodawanieKolumn() throws SQLException {
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
