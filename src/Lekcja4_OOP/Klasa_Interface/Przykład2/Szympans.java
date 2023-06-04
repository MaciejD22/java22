package Lekcja4_OOP.Klasa_Interface.Przykład2;

public class Szympans implements Zwierzęta, Ssaki{
    @Override
    public void stałaTemperaturaCiała() {
        System.out.println("Stała temperatura ciała");
    }

    @Override
    public void gruczołyMlekowe() {
        System.out.println("Posiada gruczoły mlekowe");

    }

    @Override
    public void poruszanieSię() {
        System.out.println("Porusza się na 2 lub 4 kończynach");

    }

    @Override
    public void odżywianieSię() {
        System.out.println("Wszystkożerny");

    }

    @Override
    public void gromadzenieGlikogenu() {
        System.out.println("Gromadzi glikogen w mięśniach");

    }
}
