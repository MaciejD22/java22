package Lekcja1;

import java.util.Scanner;

public class KlasaScanner {
    public static void main(String[] args) {
//        tworzymy scanr który czyta dane wprowadzane przez nas
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj swoje imię");
        String imie = scan.nextLine();

        System.out.println("Witaj,\n" + imie);
        System.out.println("Ile masz lat?");
        int wiek = scan.nextInt();

        System.out.println("Masz tylko " + wiek + " lat" );

        System.out.println("Jaki masz poziom w Battlefield 1?");
        int levelWGrze = scan.nextInt();

        System.out.println(levelWGrze + " to bardzo niski poziom");


    }
}
