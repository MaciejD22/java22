package Lekcja9_metody_na_plikach.TworzeniePliku;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj nazwę pliku: ");
    String nazwa = scanner.next();

//    Tworzymy plik, możemy ale nie musimy podać ścieżkę folderu
    File plik = new File("src/Lekcja9_metody_na_plikach/TworzeniePliku", nazwa);
    if (plik.createNewFile()){
        System.out.println("Utworzono nowy plik: " + plik.getName());
    } else {
        System.out.println("Plik o takiej nazwie już istnieje!");
    }
    }
}
