package Lekcja9_metody_na_plikach.Metody;

import java.io.File;
import java.util.Scanner;

public class PlikTylkoDoOdczytu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku: ");
        String nazwa = scanner.next();

        File file = new File("src/Lekcja9_metody_na_plikach" + "/" + nazwa);
        if(file.canWrite()){
            // mamy też metodę .canRead sprawdzająca czy plik można w ogóle odczytać
            System.out.println("Plik nie jest tylko do odczytu");
        } else {
            System.out.println("Plik tylko do odczytu");
        }

    }
}
