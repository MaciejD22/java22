package Lekcja4_OOP.Konstruktory;

public class MainKonstruktor {
    public static void main(String[] args) {

        KlasaKonstruktor klasaKonstruktor = new KlasaKonstruktor();

        System.out.println(klasaKonstruktor.pole1);


        KlasaKonstruktor obiektKlasaKonstruktor = new KlasaKonstruktor(99,2222);

        System.out.println(obiektKlasaKonstruktor.pole1);
        System.out.println(obiektKlasaKonstruktor.pole2);

        KlasaKontruktorDwa obiektKlasaKonstruktorDwa = new KlasaKontruktorDwa();



    }
}