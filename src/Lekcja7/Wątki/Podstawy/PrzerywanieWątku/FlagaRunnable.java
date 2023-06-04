package Lekcja7.Wątki.Podstawy.PrzerywanieWątku;

public class FlagaRunnable implements Runnable{

    private boolean wątekDziała;


    public void run(){
        wątekDziała = true;
        while (wątekDziała){
            System.out.println("Flag: Wątek działa");
        }
        System.out.println("Flag: Wątek przestał działać");
    }

    public void setWątekDziała(boolean wątekDziała){this.wątekDziała = wątekDziała;}
}
