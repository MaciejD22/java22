package Lekcja4_OOP.Klasa_Interface.Przykład;

public class Koło implements Figury{

    private double r;

    public Koło(double r) {this.r = r;}

    @Override
    public void pole() {
        System.out.println("Pole koła wynosi: " + (Math.PI*(r*r)));
    }

    @Override
    public void obwód() {
        System.out.println("Obwód Koła wynosi: " + (2*Math.PI*r));
    }
}
