package Lekcja9_metody_na_plikach.Metody;

import java.io.File;
import java.util.Date;

public class DataOstatniejModyfikacji {
    public static void main(String[] args) {

        File file = new File("src/Lekcja9_metody_na_plikach/tekst.txt");
        Date date = new Date(file.lastModified());

        System.out.println("Data ostatniej modyfikacji pliku: " + date);

    }
}
