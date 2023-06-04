package Lekcja3;

import java.util.Random;

public class KlasaRandom {

    //        Generowanie losowej liczby z zakresu od min do max
    //    Stworzyliśmy własną metodę/funkcję dzięki której podajemy zakres/range liczby do wylosowania
    public static int randomOfRange(int min, int max){
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    public static void main(String[] args) {
        Random random = new Random();
//        typ zmiennej musi być taki sam jak w metodzie random.next
        int liczbaLosowa = random.nextInt(11);
        System.out.println(liczbaLosowa);

//        for (int i=0; i < 5; i++){
//            float losowa= random.nextFloat();
//            System.out.println(losowa);
//        }

        System.out.println(randomOfRange(1,3));




    }

}
