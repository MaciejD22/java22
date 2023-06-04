package Lekcja7.Wątki.Podstawy;

public class Wątek1 extends Thread {
//                          ^ wątki dziedziczymy z klasy domyślnej Thread

    //  metoda run() zawiera to co wątek ma wykonać
    public void run() {
//        Metoda sleep() opóźnia nam start wątku. Wymaga obsługi  wyjątków. Możemy wyjątek obsłużyć Try Catch'em
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Błąd: Interrupted Exception");
        }

        for (double i = 0; i < 1000; i++) {
            try {Thread.sleep(1000);} catch (InterruptedException e) {
                System.out.println("Błąd: Interrupted Exception");}
            System.out.println("Pętla wątek 1: " + i);
        }
    }
}
