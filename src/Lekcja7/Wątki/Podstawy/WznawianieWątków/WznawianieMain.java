package Lekcja7.Wątki.Podstawy.WznawianieWątków;

public class WznawianieMain {
    public static void main(String[] args) {

    Thread wątek1 = new Thread(new WątekDoWznowienia());
    wątek1.start();

//    metoda join czeka aż wątek się zakończy
        try {
            wątek1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        wątek1.start();
//        Jeśli wątek raz się wykonał, nie możemy go wykonwać ponownie, nawet sleep nam nie pomoże

        System.out.println("Print po join");
}
}
