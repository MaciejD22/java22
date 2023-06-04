package Lekcja2;

public class PętlaWPętli {
    public static void main(String[] args) {
//        Pętla w Pętli inaczej Zagnieżdżona pętla po angielsku Nested loop

//        Pętla główna
        glowna_petla:
        for (int i = 0; i <10; i++){
            System.out.println("pętla główna: "  + i);
            if ( i % 2 == 1){
                continue;
            }
//            pętla zagnieżdżona wykonuje się 10 razy na jedno wykonanie pętli głównej
            for ( int j = 0; j < 10; j++){
                System.out.println("pętla zagnieżdżona: "  + j);
                if ( j > i){
                    continue glowna_petla;
                }

            }
        }
    }
}
