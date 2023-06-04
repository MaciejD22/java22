package Lekcja2;

public class PętlaWPętliPrzykład {
    public static void main(String[] args) {
        int tygodnie = 55;
        int dniTygodnia = 7;
//      Pętla główna tzn. Pętla zewnętrzna
        for (int i = 1; i <= tygodnie; i++){
            System.out.println("Tydzień: " + i);
//            Pętla zagnieżdżona tzn. Pętla wewnętrzna
            for (int j = 1; j <= dniTygodnia; j++){
                System.out.println("Dzień tygodnia: " + j);
            }
        }
    }
}
