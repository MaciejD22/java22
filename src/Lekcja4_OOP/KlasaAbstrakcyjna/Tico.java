package Lekcja4_OOP.KlasaAbstrakcyjna;

public class Tico extends AbstrakcyjnaKlasa{
    @Override
    public void napędNa() {
        System.out.println("Napęd na przednie koła.");
    }

    @Override
    public void skrzyniaBiegów() {
        System.out.println("Skrzynia biegowa manulana 5 biegów lub automatyczna 3 biegowa.");

    }
}
