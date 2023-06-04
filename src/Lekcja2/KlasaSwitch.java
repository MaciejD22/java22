package Lekcja2;

import java.util.Scanner;

public class KlasaSwitch {
    // Zmienne globalne definiujemy przed metodą Main
    public static int wartosc;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean czyKontynuowac = true;
        wartosc = 0;

        while (czyKontynuowac){
            System.out.println("Wybór opcji: ");
            System.out.println("1. Wyświetl wartości");
            System.out.println("2. Dodaj Wartość");
            System.out.println("3. Zakończ program");

            int wyborOpcji = scanner.nextInt();

            switch (wyborOpcji) {
                case 1:
                    System.out.println("Wybrano ocję nr 1");
                    System.out.println("Wartość wynosi: " + wartosc);
                    break;
                case 2:
                    wartosc = wartosc + 1;
                    System.out.println("Wybrano opcję nr 2");
                    System.out.println("Zwiększono wartość o 1");
                    System.out.println("Wartość wynosi teraz: " + wartosc);
                    break;
                case 3:
                    wartosc = wartosc - 1;
                    System.out.println("wybrano opcję nr 3");
                    System.out.println("Zmniejszono wartość o 1");
                    System.out.println("Wartość wynosi teraz: " + wartosc);
                    break;
                case 4:
                    System.out.println("Zakończenie programu");
                    czyKontynuowac = false;
            }
        }
    }
}
