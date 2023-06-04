package Lekcja1;

import java.util.Scanner;

public class ZadanieIF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj swój wiek: ");
        int wiek = scan.nextInt();

        if (wiek >= 18){
            System.out.println("Możesz wejść na stronę");
        }
        else {
            System.out.println("Jesteś niepełnoletni, strona tylko dla osób pełnoletnich");
        }
    }
}
