package Lekcja4_OOP.Klasa_Interface.Przykład2;

public class Przykład2Main {
    public static void main(String[] args) {
        Szympans szympans = new Szympans();

        System.out.println("Szympans to zwierzę, które: ");
        szympans.gromadzenieGlikogenu();
        szympans.gruczołyMlekowe();
        szympans.odżywianieSię();
        szympans.poruszanieSię();
        szympans.stałaTemperaturaCiała();

        Aligator aligator = new Aligator();
        System.out.println("Aligator to zwierzę, które: ");
        aligator.gromadzenieGlikogenu();
        aligator.odżywianieSię();
        aligator.poruszanieSię();
        aligator.składaJaja();
        aligator.zmiennaTemperaturaCiała();
    }
}
