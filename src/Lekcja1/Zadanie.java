package Lekcja1;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie {
    public static void main (String[] args){


        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj zawę towaru");
        String TOWAR = scan.nextLine();
        //tutaj był string pobierany
        System.out.println("Podaj stawkę VAT (Jako liczbę całkowitą)");
        double VAT = scan.nextDouble();
        //uwaga do int trzeba nextInt, ale tu używam double bo ważne będą przecinki
        System.out.println("Podaj kwotę netto");
        double NETTO = scan.nextInt();
        double BRUTTO = NETTO+((VAT/100) * NETTO);
        double TARA = (VAT/100) * NETTO;
        System.out.println("Produkt: \n" + TOWAR);
        System.out.println("Podatek wynosi: " + TARA);
        System.out.println("Kwota Brutto wynosi: " + BRUTTO);
        //pobiera od użytkownika dane i wypisuje je
        String Tara3 = String.valueOf((TARA));


        ArrayList<String> BAZA = new ArrayList<String>();
        BAZA.add(TOWAR);
        BAZA.add(Tara3);

//dodawanie elementu
        System.out.println(BAZA);
        System.out.println(Tara3);


    }
}