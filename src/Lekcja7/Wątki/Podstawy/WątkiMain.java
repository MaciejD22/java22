package Lekcja7.Wątki.Podstawy;

public class WątkiMain {
    public static void main(String[] args) {

        Wątek1 wątek1 = new Wątek1();
        Wątek2 wątek2 = new Wątek2();
        Thread wątek3 = new Thread(new Wątek3());

//        Do rozpoczęcia wątku używamy metody start
        wątek1.start();
        wątek2.start();
        wątek3.start();

    }
}
