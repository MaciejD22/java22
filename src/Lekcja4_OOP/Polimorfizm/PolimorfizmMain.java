package Lekcja4_OOP.Polimorfizm;

public class PolimorfizmMain {
    public static void main(String[] args) {
//      Tworzymy obiekt na podstawie klasy Pies
        Pies pies = new Pies();
        pies.odżywianie();
//      Tworzymy obiekt na podstawie interfejsu Zwierzęta
        Zwierzęta zwierzę = new Pies();
        zwierzę.odżywianie();
//      Polimorfizm pozwala nam na przypisanie wielu obiektów używając tej samej nazwy obiektu ale różnych klas
//        Metody wtedy zmienią się na te z ostatnio przypisanej klasy
        zwierzę = new Ptak();
        zwierzę.odżywianie();




    }
}
