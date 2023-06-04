package Lekcja4_OOP.ThisTeoria;

public class KlasaRozszerzona extends KlasaPodstawowa{

    int x;
    int y;
    int z;

    int pole1;

    KlasaRozszerzona(){
        System.out.println("Konstruktor klasa Rozszerzona");
    }

    KlasaRozszerzona(int a){
        x = a;
        System.out.println("Konstruktor klasa Rozszerzona z jednym parametrem: " + a);
    }

    KlasaRozszerzona(int a, int b){
        this(a);
        x = a;
        y = b;
        System.out.println("Konstruktor klasa Rozszerzona z dwoma parametrami: " + a + " i " + b);

    }


    void metodaKlasaRozszerzona(int pole1){
//        używając słowa this odwołujemy się do "pole1" na górze klasy w zdefiniowanych polach
        this.pole1 = pole1;
//                      natomiast pole1 to pole1 z parametru metody "metodaKlasaRozszerzona"
    }
}
