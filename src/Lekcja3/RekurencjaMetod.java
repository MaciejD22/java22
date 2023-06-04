package Lekcja3;

public class RekurencjaMetod {

    //        Metoda inaczej zwana Funkcją
//    Rekruencja polega na wywoływaniu metody w niej samej
    public static int rekurencja(int a) {
        if (a > 0) {
            System.out.println(a);
//            w tym miejscu wywołujemy fukncje w jej ciele
            return rekurencja(a - 1);
        } else {
            System.out.println(a);
            return 0;
        }
    }

    public static void main(String[] args) {

        rekurencja(100);
    }
}
