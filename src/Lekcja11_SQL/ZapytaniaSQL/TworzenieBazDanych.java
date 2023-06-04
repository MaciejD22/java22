package Lekcja11_SQL.ZapytaniaSQL;

import java.sql.*;

public class TworzenieBazDanych {

    public static String url = "jdbc:postgresql://localhost/postgres";
    public static String user = "postgres";
    public static String password = "admin";



    private static final String createDB = "CREATE DATABASE testowaDB;";


    public static void main(String[] args) throws SQLException{
        TworzenieBazDanych tworzenieTabel = new TworzenieBazDanych();
        tworzenieTabel.tworzenieDB();
    }

    public void tworzenieDB() throws SQLException {
        System.out.println(createDB);
        try {Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Połączo pomyślnie");
            Statement statement = connection.createStatement();
            statement.execute(createDB);

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}

