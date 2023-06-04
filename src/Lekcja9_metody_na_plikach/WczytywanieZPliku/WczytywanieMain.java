package Lekcja9_metody_na_plikach.WczytywanieZPliku;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WczytywanieMain {
    public static void main(String[] args) {
//        tworzymy obiekt plik podając scieżkę do naszego pliku
        File file = new File("src/Lekcja9_metody_na_plikach/tekst.txt");
        try {
            Scanner scanner = new Scanner(file);
// używamy scannera oraz pętli while do wczytywania linijki po linijce
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku.");
        }
    }
}
