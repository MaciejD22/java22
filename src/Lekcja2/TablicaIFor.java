package Lekcja2;

public class TablicaIFor {

    public static int liczbaElementowWTablicy;

    public static void main(String[] args) {
        liczbaElementowWTablicy = 1000;
        int[] tablica = new int[liczbaElementowWTablicy];

// element startwy od jakiej wartości tablica ma zacząć się tworzyć
        int x = 250;

//        Tworzenie tablicy przy użyciu pętli for
        for ( int i = 0; i < liczbaElementowWTablicy; i++){
            tablica[i] = i + x;
        }
// wyświetlanie tablicy
        for ( int i = 0; i < liczbaElementowWTablicy; i++){
            System.out.println(tablica[i]);
        }
        System.out.println(x);
    }
}
