package Lekcja9_metody_na_plikach.WczytywanieZPliku;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class InputStreamReader {
    public static void main(String[] args) {
// Input Stream Reader może wczytać na raz cały plik. Używa się go raczej do plików z liczbami lub z byteami. Do tesktu rzadziej.

        try {
            List<String> listAllLines = Files.readAllLines(Paths.get("src/Lekcja9_metody_na_plikach/tekst.txt"));
            System.out.println(listAllLines);
        } catch (IOException e) {
            System.out.println("Ups! Something gone wrong!");
        }


    }
}
