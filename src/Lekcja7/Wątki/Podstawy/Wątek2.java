package Lekcja7.Wątki.Podstawy;

public class Wątek2 extends Thread{

//    każdy wątek by się wykonał musi mieć metodę run()
    public void run() {
        for (double i = 0; i < 1000; i++)
            System.out.println("Pętla wątek 2: " + i);
    }

}
