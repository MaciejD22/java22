package Lekcja4_OOP.Klasa_Interface.Przykład;

public class FiguryMain {
    public static void main(String[] args) {
        Koło koło = new Koło(5);

        koło.obwód();
        koło.pole();

        Prostokąt prostokąt = new Prostokąt(10,5);

        prostokąt.obwód();
        prostokąt.pole();

    }
}
