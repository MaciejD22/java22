    package Lekcja1;

    public class While_loop {
        public static void main(String[] args) {
            int x = 97;

    //         Pętla While wykonuje się tak długo jak jej warunek jest spełniony
            while (x < 100){
                System.out.println(x + " wewnątrz pętli while");
                x++;
            }
            System.out.println("to już jest poza pętlą while");
    //
    //        do while wykona się zawsze minimum 1 raz nawet jeśli warunek nie jest spełniony,
    //        jeśłi warunek jest spełniony to pętla zadziałą podonie jak zwykły while
    //        do {
    //            System.out.println("pętla do while wykona się zawsze chociaż raz");
    //            x++;
    //        } while ( x < 100);
    //        System.out.println("jesteśmy za pętlą do while");

        }
    }
