package Lekcja7.Wątki.Podstawy.PrzerywanieWątku;

public class PrzerywanieWątkuMain {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new Wątek1());
// metoda start do rozpoczęcia wątku
        thread1.start();
//        metoda interrupt do przerywania wątków
        thread1.interrupt();

        Thread thread2 = new Thread(new Wątek2());

        thread2.start();
        thread2.interrupt();

//        Flaga

FlagaRunnable flagaRunnable = new FlagaRunnable();
Thread wątekFlaga = new Thread(flagaRunnable);
wątekFlaga.start();

Thread.sleep(1000);
flagaRunnable.setWątekDziała(false);




    }
}
