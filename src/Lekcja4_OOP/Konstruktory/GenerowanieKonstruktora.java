package Lekcja4_OOP.Konstruktory;

public class GenerowanieKonstruktora {
    int poleJeden;
    int poleDwa;
    String poleTrzy;

    public GenerowanieKonstruktora(int poleJeden, int poleDwa, String poleTrzy) {
        this.poleJeden = poleJeden;
        this.poleDwa = poleDwa;
        this.poleTrzy = poleTrzy;
//        generator konstruktorów korzysta ze słowa kluczowego this
//        dzięki temu tworzy spójne nazwy więdzy polami zdefiniowanymi na górze klasy, a parametrami w metodzie
    }
}
