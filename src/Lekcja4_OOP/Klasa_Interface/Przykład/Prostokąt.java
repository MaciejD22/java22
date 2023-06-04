package Lekcja4_OOP.Klasa_Interface.Przykład;

public class Prostokąt implements Figury{
    private double a;
    private double b;

    public Prostokąt(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void pole() {
        System.out.println("Pole prostokąta wynosi: " + a*b);
    }

    @Override
    public void obwód() {
        System.out.println("Obwód prostokąta wynosi: " + (2*a+2*b));

    }
}
