package Lekcja4_OOP.KlasaWewnętrzena;

public class KlasaWewnętrznaMain {
    public static void main(String[] args) {

        KlasaZewnętrzna obiektKlasyZewnętrznej = new KlasaZewnętrzna();

        System.out.println(obiektKlasyZewnętrznej.poleKlasaZewnętrzna);

        // Tworzymy obiekt klasy wewnętrznej (zagnieżdżonej) w KlasaZewnętrzna

        KlasaZewnętrzna.KlasaWewnętrznaWKlasieZewnętrznej obiektKlasaZagnieżdżona = new KlasaZewnętrzna.KlasaWewnętrznaWKlasieZewnętrznej();

        System.out.println(obiektKlasaZagnieżdżona.poleKlasyWewnętrznejWKlasieZewnętrznej);

        obiektKlasaZagnieżdżona.metodaKlasyZagnieżdżonej();

        obiektKlasyZewnętrznej.metodaKlasyZewnętrznej();



    }
}
