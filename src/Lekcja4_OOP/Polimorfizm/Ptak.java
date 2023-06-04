package Lekcja4_OOP.Polimorfizm;

public class Ptak implements Zwierzęta{
    @Override
    public void odżywianie() {
        System.out.println("Ptak je głównie ziarna.");
    }

    @Override
    public void poruszanieSię() {
        System.out.println("Dzięki skrzydłom lata.");
    }
}
