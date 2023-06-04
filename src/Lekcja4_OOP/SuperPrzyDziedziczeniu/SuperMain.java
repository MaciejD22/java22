package Lekcja4_OOP.SuperPrzyDziedziczeniu;

public class SuperMain {
    public static void main(String[] args) {

        BurgerClassic burgerClassic = new BurgerClassic("Pszenna", "Wołowina",true);
        BurgerDrwala burgerDrwala = new BurgerDrwala("Pszenna", "Wołowina",true);
        BurgerTexas burgerTexas = new BurgerTexas("Pszenna", "Wołowina",true);

        burgerClassic.infoBurgerClassic();
        burgerDrwala.infoBurgerDrwala();
        burgerTexas.infoBurgerTexas();

    }
}
