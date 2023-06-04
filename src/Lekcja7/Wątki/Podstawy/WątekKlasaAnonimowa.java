package Lekcja7.Wątki.Podstawy;

public class WątekKlasaAnonimowa {
    public static void main(String[] args) {


        //    Jak stworzyć wątek przy użyciu klasy anonimowej
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("Pętla wątek Anonim: " + i);
                }
            }
        });

        thread.start();


    }
}
