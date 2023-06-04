package Lekcja4_OOP.Polimorfizm;

public class Pies implements Zwierzęta {
    @Override
    public void odżywianie() {
        System.out.println("Pies zje wszystko, cały czas.");
    }

    @Override
    public void poruszanieSię() {
        System.out.println("Pies chodzi, biega na 4 łapach.");
    }
}
