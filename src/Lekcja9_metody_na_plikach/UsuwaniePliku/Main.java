package Lekcja9_metody_na_plikach.UsuwaniePliku;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nazwę pliku do usunięcia: ");
        String nazwa = scanner.next();

        File plik = new File(nazwa);
//      Usuwanie z innej lokalizacji
//        File plik = new File("src/Lekcja9_metody_na_plikach/TworzeniePliku", nazwa);


        if (plik.delete()){
            System.out.println("Usuwanie pliku " + plik.getName());
        } else {
            System.out.println("Nie można usunąć pliku.");
        }


    }
}
