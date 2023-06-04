package Lekcja4_OOP.KlasaAbstrakcyjna;

public class AbstrakcyjnaMain {
    public static void main(String[] args) {

        Polonez polonez = new Polonez();
        Tico tico = new Tico();

        System.out.println("Polonez, specyfikacja: ");
        polonez.napędNa();
        polonez.skrzyniaBiegów();
        polonez.paliwo();
        polonez.rodzajSilnika();

        System.out.println("Tico, specyfikacja: ");
        tico.napędNa();
        tico.skrzyniaBiegów();
        tico.paliwo();
        tico.rodzajSilnika();

    }
}
