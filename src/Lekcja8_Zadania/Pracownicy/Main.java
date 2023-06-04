package Lekcja8_Zadania.Pracownicy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ListaPracowników listaPracowników = new ListaPracowników();
        ListaKierowników listaKierowników = new ListaKierowników();

        boolean czyKontynuować = true;

        while (czyKontynuować){
            System.out.println("Wybierz opcję: ");
            System.out.println("1. Dodaj nowego pracownika.");
            System.out.println("2. Dodaj nowego kierownika.");
            System.out.println("3. Wyświetl wszystkich pracowników.");
            System.out.println("4. Wyświetl wszystkich kierowników.");
            System.out.println("5. Zakończ program.");

            int wybórOpcji = scanner.nextInt();

            switch (wybórOpcji){
                case 1:
                    System.out.println("Dodaj nowego pracownika. Podaj jego dane: ");
                    listaPracowników.dodajPracownika();
                    break;
                case 2:
                    System.out.println("Dodaj nowego kierownika. Podaj jego dane: ");
                    listaKierowników.dodajKierownika();
                    System.out.println();
                case 3:
                    System.out.println("Lista wszystkich pracowników: ");
                    listaPracowników.wyświetlWszystkichPracowników();
                    break;
                case 4:
                    System.out.println("Lista wszystkich kierowników: ");
                    listaKierowników.wyświetlWszystkichKierowników();


            }
        }
    }
}
