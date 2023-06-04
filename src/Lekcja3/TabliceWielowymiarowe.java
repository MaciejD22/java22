package Lekcja3;

public class TabliceWielowymiarowe {
    public static void main(String[] args) {

        int [] tablica1wymiarowa = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(tablica1wymiarowa[1]);

//   Tablica dwuwymiarowa czyli taka co ma wiersze i kolumny. Symetryczna czyli liczba wierszy = liczba kolumn
//        int [] [] tablicaDwuWymiarowa = new  int[3][3];
//        tablicaDwuWymiarowa[0][0] = 1;
//        tablicaDwuWymiarowa[0][1] = 2;
//        tablicaDwuWymiarowa[0][2] = 3;
//        tablicaDwuWymiarowa[1][0] = 4;
//        tablicaDwuWymiarowa[1][1] = 5;
//        tablicaDwuWymiarowa[1][2] = 6;
//        tablicaDwuWymiarowa[2][0] = 7;
//        tablicaDwuWymiarowa[2][1] = 8;
//        tablicaDwuWymiarowa[2][2] = 9;

//        sposób na szybkie i przejrzyste dodawanie wielu elementów
        int[][] tablicaDwuWymiarowa = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

//        [1][2][3]
//        [4][5][6]
//        [7][8][9]

        for (int i = 0; i <tablicaDwuWymiarowa.length; i++){
            for (int j = 0; j <tablicaDwuWymiarowa.length; j++){
                System.out.println(tablicaDwuWymiarowa[i][j]);
            }
        }

        int[][] dwuWymiarowaNiesymetrzyczna = new int[3][2];
        dwuWymiarowaNiesymetrzyczna[0][0] = 1;
        dwuWymiarowaNiesymetrzyczna[0][1] = 2;
        dwuWymiarowaNiesymetrzyczna[1][0] = 3;
        dwuWymiarowaNiesymetrzyczna[1][1] = 4;
        dwuWymiarowaNiesymetrzyczna[2][0] = 5;
        dwuWymiarowaNiesymetrzyczna[2][1] = 6;

//        [1][2]
//        [3][4]
//        [5][6]

        for (int i = 0; i <dwuWymiarowaNiesymetrzyczna.length; i++){
            for (int j = 0; j <dwuWymiarowaNiesymetrzyczna[i].length; j++){
                System.out.println(dwuWymiarowaNiesymetrzyczna[i][j]);
            }
            System.out.println();
        }

    }
;

}
