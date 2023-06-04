package Lekcja4_OOP.KlasaAbstrakcyjna;

public class Polonez extends AbstrakcyjnaKlasa{
    @Override
    public void napędNa() {
        System.out.println("Napęd na tylne koła.");

    }

    @Override
    public void skrzyniaBiegów() {
        System.out.println("Manualna 4 lub 5 biegowa.");

    }
}
