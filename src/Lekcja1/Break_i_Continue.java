package Lekcja1;

public class Break_i_Continue {
    public static void main(String[] args) {
//        break służy do zakończenia działania pętli nawet jeśli warunek podany w pętli dalej jest prawdziwy
//        for (int i = 1; i < 5; i++){
//            System.out.println("pętla się wykonuje " + i);
//            if ( i == 3) {
//                break;
//            }
////            System.out.println("jesteśmy za if");
//        }

        // contiue służy do wyjścia pętli tylko raz gdy dany warunek jest spełniony i kontynuuje działąnie pętli

        for ( int i = 1; i < 5; i++){
            if (i == 3){
                continue;
            }
            System.out.println("pętla for się wykonuje " + i);
        }
        System.out.println("poza pętlą for");
        int x = 21  ;
        int modulo = x%2;
        System.out.println(modulo);
    }
}
