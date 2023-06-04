package Lekcja9_metody_na_plikach.Metody;

import java.io.File;
import java.util.Scanner;

public class SprawdzanieWagiPliku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku: ");
        String nazwa = scanner.next();

        File file = new File("src/Lekcja9_metody_na_plikach" + "/" + nazwa);

        if(file.exists()){
//            pokazuje wagę w bytach
            System.out.println(file.getTotalSpace());
        }
    }
}
