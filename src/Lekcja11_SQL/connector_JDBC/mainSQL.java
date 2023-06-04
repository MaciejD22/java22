package Lekcja11_SQL.connector_JDBC;

import java.sql.*;


public class mainSQL {

    public static String url = "jdbc:postgresql://localhost/postgres";
    public static String user = "postgres";
    public static String password = "admin";


    public Connection connect(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Połączo pomyślnie");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return  conn;
    }

    public static void main(String[] args) {
        mainSQL sql = new mainSQL();
        sql.connect();

    }
}
