package Lekcja3;

import java.util.Scanner;

public class GraWKości {

    public static String PlayerOne;
    public static String PlayerTwo;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean czyKontynuować = true;

        while (czyKontynuować){
            System.out.println("Wybór opcji: ");
            System.out.println("1. Dodaj imię pierwszego gracza.");
            System.out.println("2. Dodaj imię drugiego gracza.");
            System.out.println("3. Rozpocznij grę!");
            System.out.println("4. Wyjdź z gry.");

            int wyborOpcji = scanner.nextInt();

            switch (wyborOpcji){
                case 1:
                    System.out.println("Player One, jak masz na imię?");
                    String P1name = scanner.next();
                    PlayerOne = P1name;
                    break;
                case 2:
                    System.out.println("Player Two, jak masz na imię?");
                    String P2name = scanner.next();
                    PlayerTwo = P2name;
                    break;
                case 3:
//                    gra w kości czyli każdy gracz rzuca dwa razy kostką, sumujemy wynik
//                    gracz z większą liczbą oczek wygrywa
//                    random int, sumowanie wyników i porównanie wyniku by wyświetlić komnikat
//                    Gracz 1/2 wygrywa!
                case 4:
//                    Zakończ program




            }

        }




    }
}
