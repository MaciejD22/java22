package Lekcja4_OOP.ThisTeoria;

public class MainThis {
    public static void main(String[] args) {
        KlasaRozszerzona obiekt1KlasaRozszerzona = new KlasaRozszerzona();
        System.out.println("---------------------------------------------");
        KlasaRozszerzona obiekt2KlasaRozszerzona = new KlasaRozszerzona(20);
        System.out.println("---------------------------------------------");
        KlasaRozszerzona obiekt3KlasaRozszerzona = new KlasaRozszerzona(2, 3);
        System.out.println("---------------------------------------------");
        System.out.println(obiekt3KlasaRozszerzona.x);
        System.out.println(obiekt3KlasaRozszerzona.y);
        System.out.println("---------------------------------------------");
        obiekt3KlasaRozszerzona.metodaKlasaRozszerzona(100);
        System.out.println(obiekt3KlasaRozszerzona.pole1);


    }
}
