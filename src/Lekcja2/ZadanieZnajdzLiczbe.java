package Lekcja2;

import java.util.Random;
import java.util.Scanner;

public class ZadanieZnajdzLiczbe {
    public static int liczba;

    public static void main(String[] args) {
        Random random = new Random();
        int wylosowanaLiczba = random.nextInt(10);

        while (true){
            System.out.println("Zgadnij jaką liczbę wylosowałem");
            Scanner scan = new Scanner(System.in);
            liczba = scan.nextInt();

            if (liczba == wylosowanaLiczba){
                System.out.println("Brawo zgadłeś");
            break;}
            else if (liczba > wylosowanaLiczba){
                System.out.println("Nie zgadłeś, podałeś za dużą liczbę");}
            else if ( liczba < wylosowanaLiczba){
                System.out.println("Nie zgadłeś, podana liczba jest mniejsza");}
        }
    }
}
