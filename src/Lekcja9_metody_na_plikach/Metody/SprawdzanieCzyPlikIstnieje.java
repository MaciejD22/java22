package Lekcja9_metody_na_plikach.Metody;

import java.io.File;
import java.util.Scanner;

public class SprawdzanieCzyPlikIstnieje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku: ");
        String nazwa = scanner.next();

//        Sprawdza czy dany plik lub folder istnieje ALE trzeba podać pełną nazwę razem z rozszerzeniem pliku np. tekst.txt
        File file = new File("src/Lekcja9_metody_na_plikach"+"/"+nazwa);
        if( file.exists()){
            System.out.println("Ten plik/folder istnieje");
//            wyświetlenie ściezki pliku
            System.out.println(file.getPath());
        } else {
            System.out.println("Nie znaleziono takiego pliku lub folderu.");
        }

    }
}
