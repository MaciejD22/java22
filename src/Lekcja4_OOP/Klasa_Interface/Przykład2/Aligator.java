package Lekcja4_OOP.Klasa_Interface.Przykład2;

public class Aligator implements Zwierzęta, Gady{
    @Override
    public void składaJaja() {
        System.out.println("Składa jaja");
    }

    @Override
    public void zmiennaTemperaturaCiała() {
        System.out.println("Posiada zmienną temperaturę ciała");
    }

    @Override
    public void poruszanieSię() {
        System.out.println("Porusza się na 4 kończynach");

    }

    @Override
    public void odżywianieSię() {
        System.out.println("Mięsożerny");

    }

    @Override
    public void gromadzenieGlikogenu() {
        System.out.println("Gromadzi glikogen w mięśniach");

    }
}
