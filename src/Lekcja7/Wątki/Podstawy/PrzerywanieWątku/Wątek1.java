package Lekcja7.Wątki.Podstawy.PrzerywanieWątku;

public class Wątek1 implements Runnable{
    @Override
    public void run() {


//        Sposób 1 zalecany
        while (true){
            System.out.println("Wątek 1 trwa.");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Wątek 1 został przerwany Try Catch. Błąd Interrupted Exception");
                break;
//                Tutaj zakończyliśmy wątek ponieważ Try Catch wyłapał wyjątek InterruptedException
            }

            System.out.println("Dalsza część kodu w pętli.");
        }

//            Sposób 2 pętla while z warunkiem if
//        while(true){
//            System.out.println("Wątek 1 trwa.");
//
//            if (Thread.interrupted()){
//                System.out.println("Wątek 1 został przerwany While If. Błąd Interrupted Exception");
//                break;
//            }
//        }

////        Sposób 3 na wyjście z wątku
//        while(Thread.interrupted()){
//            System.out.println("Wątek 1 działa.");
//        }
//        System.out.println("Wątek 1 został przerwany While otrzymał wartość false i przestał działać");

        System.out.println("Dalsza część kodu za pętlą.");

    }
}
