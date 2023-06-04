package Lekcja3;

import java.util.HashMap;

public class HashMapy {
    public static void main(String[] args) {

        HashMap<String, String> dreamTeam = new HashMap<String, String>();

        dreamTeam.put("Robert", "Lewandowski");
        dreamTeam.put("Wojciech", "Szczęsny");
        dreamTeam.put("Kamil", "Glik");

        System.out.println(dreamTeam);
        System.out.println(dreamTeam.get("Robert"));
//        Usuwanie elementu
        dreamTeam.remove("Kamil");
        System.out.println(dreamTeam);
//        dreamTeam.clear() - usuwa wszystkie elementy
//        dreamTeam.size();

//        wyświetlanie kluczy
        for(String i : dreamTeam.keySet()){
            System.out.println(i);
        }
//      wyswietlamy wartości
        for(String i : dreamTeam.values()){
            System.out.println(i);
        }
//  wyświetlanie klucza i wartości
        for(String i : dreamTeam.keySet()){
            System.out.println("Klucz: " + i +", Wartość: " + dreamTeam.get(i));
        }
// klucz też mże być liczbą, wartości też mogąbyć liczbowe
        HashMap<Integer, String> drugaHashmapa = new HashMap<Integer, String>();
        drugaHashmapa.put(1,"A");
        drugaHashmapa.put(2,"B");
        System.out.println(drugaHashmapa);
    }

//   drugaHashapa.putAll() - metoda na wkładanie wszystich elementów jednego zbioru do drugiego
}
