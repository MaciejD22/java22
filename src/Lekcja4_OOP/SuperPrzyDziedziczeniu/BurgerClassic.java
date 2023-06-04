package Lekcja4_OOP.SuperPrzyDziedziczeniu;

public class BurgerClassic {
    String bułka;
    String mięso;
    boolean sałata;

    public BurgerClassic(String bułka, String mięso, boolean sałata) {
        this.bułka = bułka;
        this.mięso = mięso;
        this.sałata = sałata;
    }

    void infoBurgerClassic(){
        System.out.println("Burger Classic składa się z: ");
        System.out.println("Bułka: " + bułka);
        System.out.println("Mięso: " + mięso);
        System.out.println("sałata: " + sałata);
        System.out.println();
    }

}
