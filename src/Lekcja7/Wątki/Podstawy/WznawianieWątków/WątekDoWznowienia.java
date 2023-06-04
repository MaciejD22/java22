package Lekcja7.Wątki.Podstawy.WznawianieWątków;

public class WątekDoWznowienia implements Runnable {

    public void run(){
        for(int i = 0; i<5; i++){
            try {Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Wątek do wznowienia. " + i);
        }
    }
}
