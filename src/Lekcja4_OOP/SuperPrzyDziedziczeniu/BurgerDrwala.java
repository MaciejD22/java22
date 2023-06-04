package Lekcja4_OOP.SuperPrzyDziedziczeniu;

public class BurgerDrwala extends BurgerClassic {
    String dodatki;

//    Przy dziedziczeniu klas zapyta się nas czy ma dziedziczyć konstruktor. Możemy go odziedziczyć i wykorzystywać\
//    przy użyciu słowa kluczowego super
    public BurgerDrwala(String bułka, String mięso, boolean sałata) {
        super(bułka, mięso, sałata);
        dodatki = "ser, cebula, sos BBQ";
    }

    void infoBurgerDrwala() {
        System.out.println("Burger Drwala składa się z: ");
        System.out.println("Bułka: " + bułka);
        System.out.println("Mięso: " + mięso);
        System.out.println("sałata: " + sałata);
        System.out.println("Dodatki: " + dodatki);
        System.out.println();
    }
// przy użyciu słowa kluczowego super możemy też dziedziczyć metody
    @Override
    void infoBurgerClassic() {
        super.infoBurgerClassic();
    }
}
