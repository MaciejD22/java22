package Lekcja4_OOP.SuperPrzyDziedziczeniu;

public class BurgerTexas extends BurgerClassic{
    boolean bekon;
    public BurgerTexas(String bułka, String mięso, boolean sałata) {
        super(bułka, mięso, sałata);
        bekon = true;
    }

    void infoBurgerTexas() {
        System.out.println("Burger Texas składa się z: ");
        System.out.println("Bułka: " + bułka);
        System.out.println("Mięso: " + mięso);
        System.out.println("Bekon: " + bekon);
        System.out.println();
    }
}
