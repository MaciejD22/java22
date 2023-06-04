package Lekcja4_OOP.KlasaWewnętrzena;

public class KlasaZewnętrzna {

    int poleKlasaZewnętrzna = 100;

    public  void metodaKlasyZewnętrznej(){
        System.out.println("Metoda klasy zewnętrznej");
    }

    public static class KlasaWewnętrznaWKlasieZewnętrznej{
        // Tworąc klasę w klasie tworzymy klasę wewnetrzną zwaną też klasą zagnieżdżoną

        String poleKlasyWewnętrznejWKlasieZewnętrznej = "Pole klasy zagnieżdżonej.";

        public void metodaKlasyZagnieżdżonej(){
            System.out.println("Metoda klasy zagnieżdżonej");
        }
    }
}
