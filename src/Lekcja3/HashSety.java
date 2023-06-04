package Lekcja3;

import java.util.HashSet;
import java.util.Set;

public class HashSety {
    public static void main(String[] args) {

        Set<String> pierwszySet = new HashSet<>();
        pierwszySet.add("Kot");
        pierwszySet.add("Pies");
        pierwszySet.add("Koń");

        Set<String> drugiSet = new HashSet<>();
        drugiSet.add("Lama");
        drugiSet.add("Żaba");
        drugiSet.add("Pies");

//        Poruszanie się po Set'ach
        for (String i : pierwszySet){
            System.out.println(i);

//        System.out.println(pierwszySet);
//        System.out.println(drugiSet);
////        W Set'ach dodajemy wszystkie elementy przy użyciu metody addAll()
//        pierwszySet.addAll(drugiSet);
////        W Set'ach nie mogą występować 2 identyczne wartości
//        System.out.println(pierwszySet);
//
////        Metody do wykonania na Set'ach
////        sprawdzenie czy dana wartość znajduje się w Set'cie
//        System.out.println(pierwszySet.contains("Pies"));
////        Usuwanie elementu
//        pierwszySet.remove("Pies");
////        usuwanie wszystkich elementów
//        pierwszySet.clear();
////        sprawdzenie ile ma elementów
//        pierwszySet.size();
        }
    }
}
