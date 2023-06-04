package Lekcja7.Wątki.Podstawy.PrzerywanieWątku;

public class Wątek2 implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.println("Wątek 2 działa.");
//            Dajemy instrukcję if i warunek Thred.interrupted żeby wątek wykrył kiedy jest przerywany
            if(Thread.interrupted()){
                System.out.println("Wątek 2 przerwany");
//                Musimy dać return lub break żeby pętla się zakończyła
                break;
            }
        }

    }
}
