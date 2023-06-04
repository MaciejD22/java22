package Lekcja9_metody_na_plikach.ZapisywanieDoPliku;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ZapisywanieZBufferedWriter {
    public static void main(String[] args) {
        String path = "src/Lekcja9_metody_na_plikach/tekst.txt"; // Tworzymy stringa path z lokalizacją pliku
        try {
            FileWriter fileWriter = new FileWriter(path, true); // tworzymy fileWriter, parametr append True pozwala na nienadpisywanie pliku
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); // używamy ten file Writer do Buffered Writera
            bufferedWriter.newLine();
            bufferedWriter.write("Jakiś tekst."); // dodajemy tekst do bufferedWritera
            bufferedWriter.newLine(); // domyślnie bufferedWriter zapisuje ciągiem, newLine tworzy nową linijkę
            bufferedWriter.write("Kolejny tekst");
            bufferedWriter.close();// zamykamy strumień żeby zapisać w pliku dodawane teksty
//            bufferedWriter.write("Tekst 3"); po zamknięciu strumienia nie możemy już dodać więcej tesktu


        } catch (IOException e) {
            System.out.println("Bład wgrywania pliku.");        }
    }

}
