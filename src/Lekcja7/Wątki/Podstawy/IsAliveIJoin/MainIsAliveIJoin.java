package Lekcja7.Wątki.Podstawy.IsAliveIJoin;

public class MainIsAliveIJoin {
    public static void main(String[] args) {
        System.out.println("Zanim włączyłem wątek.");

        Thread wątek1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i< 10; i++){
                    System.out.println("Wątek 1, trwa sekund "  + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

wątek1.start();
        System.out.println("Czy wątek jeszcze żyje? " + wątek1.isAlive());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Czy wątek jeszcze żyje? " + wątek1.isAlive());

        try {Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Czy wątek jeszcze żyje? " + wątek1.isAlive());



    }
}
