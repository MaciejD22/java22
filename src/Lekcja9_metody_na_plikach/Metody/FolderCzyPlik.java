package Lekcja9_metody_na_plikach.Metody;

import java.io.File;
import java.util.Scanner;

public class FolderCzyPlik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku: ");
        String nazwa = scanner.next();

//        Możemy zastosować toLoweCase żeby szukanie nie było czułe duże znaki w nazwie plików
        File fileDir = new File("src/Lekcja9_metody_na_plikach" + "/" + nazwa.toLowerCase());

//        Sprawdzamy czy jest plikiem
        if (fileDir.isFile()){
            System.out.println("To jest plik.");
        } else {
            System.out.println("To nie jest plik.");
        }
// sprawdzamy czy jest folderem
        if (fileDir.isDirectory()){
            System.out.println("To jest folder.");
        } else {
            System.out.println("To nie jest folder.");
        }

    }
}
