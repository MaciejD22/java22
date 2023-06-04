package Lekcja8_Zadania.Zadanie2_OOP_abstra_anonim;

public class Zadanie2Main {
    public static void main(String[] args) {
// tworzymy obiekty na podstawie klas
        Bocian bocian = new Bocian();
        Orzeł orzeł = new Orzeł();
// Wykorzystujemy metody z nasyzch Klas
        System.out.println("Bocian to ptak, który: ");
        bocian.skrzydła();
        bocian.dziób();
        bocian.nogi();
        bocian.rozpiętośćSkrzydeł();
        bocian.waga();

        System.out.println("=====================================");

        System.out.println("Orzeł to ptak, który: ");
        orzeł.skrzydła();
        orzeł.dziób();
        orzeł.nogi();
        orzeł.rozpiętośćSkrzydeł();
        orzeł.waga();

    }
}
