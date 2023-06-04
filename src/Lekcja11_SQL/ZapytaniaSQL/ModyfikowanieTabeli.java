package Lekcja11_SQL.ZapytaniaSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ModyfikowanieTabeli {

    public static String url = "jdbc:postgresql://localhost/postgres";
    public static String user = "postgres";
    public static String password = "admin";



    private static final String dodawanieKolumny = "ALTER TABLE pracownicy ADD id_pracownika SERIAL;" +
            "ALTER TABLE pracownicy ADD PRIMARY KEY (id_pracownika);";
    private static final String usuwanieKolumny = "ALTER TABLE pracownicy DROP pesel;";

    private static final String zmianaNazwyKolumny = "ALTER TABLE pracownicy RENAME pesel to wiek;";

    private static final String zmianaTypuDanychKolumny = "ALTER TABLE pracownicy ALTER COLUMN pensja TYPE DECIMAL(30,2);";







    public static void main(String[] args) throws SQLException {
        ModyfikowanieTabeli modyfikowanieTabeli = new ModyfikowanieTabeli();
        modyfikowanieTabeli.modyfikowanieTabeli();
    }

    public void modyfikowanieTabeli() throws SQLException {
        System.out.println(dodawanieKolumny);
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Połączo pomyślnie");
            Statement statement = connection.createStatement();
            statement.execute(dodawanieKolumny);

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
