package Lekcja3;

import java.util.Scanner;

public class    ZadanieTablice {
    public static void main(String[] args) {
////        int [] tablica = { 1, 2, 3, 4, 5, 6, 7, 8};
//////        wyświetlanie listy w jednym wierszu
////        for (int i = 0; i <  tablica.length; i++){
////            System.out.print(tablica[i]);
////        }
////// wyświetlanie listy od tyłu
////        for (int i = tablica.length - 1; i>= 0; i--){
////            System.out.println(tablica[i]);
////        }
////    }
////}
//
////Napisz progrm, który po podaniu liczby n,
////narysuje tyle wierszy w których będzie tyle gwiazdek ile wynosi n
//
//
//    public static void Main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Podaj ile wierszy mam narysować: ");
//        int liczbaWierszy = scanner.nextInt();
//
//        int liczbaGwiazdek = 1;
//// ten for odpowiada za rysowanie całości
//        for(int i = 1; i <= liczbaWierszy; i++){
////            ten for odpowiada za pojedynczy wiersz
//            for(int j = 1; j <= liczbaGwiazdek; j++ ){
////                by gwiazdki byly w jednym wierszu używamy zwykłego print
//                System.out.print("*");
//            }
//            liczbaGwiazdek++;
//            System.out.println();
//        }
//    }
//}
//
////Napisz kolejny program rysujący trójkąt ale w drugą stronę
//   *
//  **
// ***
//****


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ile wierszy mam narysować: ");
        int liczbaWierszy = scanner.nextInt();
        int liczbaGwiazdek = 1;
        int liczbaSpacji = liczbaWierszy - 1;

        for (int i = 1; i <= liczbaWierszy; i++){
            for(int j = 1; j <= liczbaSpacji; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= liczbaGwiazdek; j++){
                System.out.print("*");
            }
            liczbaSpacji--;
            liczbaGwiazdek++;
            System.out.println();
        }
    }
}

//Niech program rysuje choinkę
//  *
// ***
//*****