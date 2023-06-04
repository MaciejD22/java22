package Lekcja9_metody_na_plikach.WczytywanieZPliku;

import java.io.*;

public class WczytywanieZBufferedReader {
    public static void main(String[] args) {
//        Do wczytywania plików tekstowych specjalnie służy do tego Buffered Reader. Jest on wydajniejszy niż używanie
//        Scannera zwłaszcza przy dużych plikach


        try {
            File file = new File("src/Lekcja9_metody_na_plikach/tekst.txt"); //Tworzymy obiekt pliku dajemy plik do File Readera i tworzmy obiekt z fileReader
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader); //tworzymy obiekt bufferedReader gdzie podajemy mu fileReader. Buffered Reader wczytuje strumień który z pliku wczytał File Reader
//            Teraz tworzymy sobie Stringa np. line czyli jedną linię
            String line;
//          Używamy pętli while żeby wczytać linijkę po linijce przy użyciu bufferedReader.readLine
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku.");
        } catch (IOException e) {
            System.out.println("Buffered Reader Nie znalazł tekstu w pliku.");
        }


    }
}
