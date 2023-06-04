package Lekcja4_OOP.Konstruktory;

import Lekcja4_OOP.KlasaWewnętrzena.KlasaZewnętrzna;

public class KlasaKonstruktor {

    int pole1;
    int pole2;

    KlasaKonstruktor(){
        pole1 = 1;

    }

    KlasaKonstruktor(int wartość1, int wartość2){
        pole1 = wartość1;
        pole2 = wartość2;
        System.out.println("Tak działa konstruktor");
        System.out.println("wynik mnożenia twoich wartości " + (pole1*pole2));
    }

    KlasaKonstruktor(int wartośćA){
        pole1 = wartośćA;
        pole2 = 3333;
    }

}
