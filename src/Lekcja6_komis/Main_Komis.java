package Lekcja6_komis;

import java.util.Scanner;

public class Main_Komis {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Stock stock = new Stock();

        boolean czyKontynuować = true;

        while (czyKontynuować){
            System.out.println("Zarządzanie Stokiem komisu u Mireczka");
            System.out.println("Wybierz opcję: ");
            System.out.println("1. Pokaż wszystkie samochody");
            System.out.println("2. Dodaj samochód");
            System.out.println("3. Liczba samochodów na stocku");

            int wybórOpcji = scanner.nextInt();

            switch (wybórOpcji){
                case 1:
//                    funkcja do wyświetlania wszystkich aut
                    stock.displayCar();
                    break;
                case 2:
//                    funkcja do dodawania samochodu
                    stock.addCar();
                    break;
                case 3:
                    stock.liczbaSamochodówNaStocku();
                    break;
            }
        }

    }
}
