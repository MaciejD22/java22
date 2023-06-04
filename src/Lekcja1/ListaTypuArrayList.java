package Lekcja1;

import java.util.ArrayList;
import java.util.Collections;

public class ListaTypuArrayList {
    public static void main(String[] args) {

        ArrayList<String> nazwaListy = new ArrayList<String>();
        // add metoda która dodaje kolejny element na końcu listy
        nazwaListy.add("Kot");
        nazwaListy.add("Alpaka");
        nazwaListy.add("Pies");
        nazwaListy.add("Koń");
        nazwaListy.add("Ptak");
        nazwaListy.add("Tygrys");
        nazwaListy.add("Lama");
        // get metoda na pobanie/dotarcie do elementu listy po indexie
        System.out.println(nazwaListy.get(1));
        // remove usuwa element z listy o danym indexie
        System.out.println(nazwaListy.remove(2));
        // set - zmiana elementu w liście ( index, nowa wartość)
        nazwaListy.set(0,"Kaczka");
        // size - sprawdza nam ile lista ma elementów
        System.out.println(nazwaListy.size());
        // clear usuwa wszystkie elementy z listy
//        nazwaListy.clear();
        System.out.println(nazwaListy);


//      Poruszanie się po liście for i foreach
//        for (int i = 0; i < nazwaListy.size(); i++){
//            System.out.println(nazwaListy.get(i));
//        }
//        for (String i : nazwaListy) {
//            System.out.println(i);
//        }

        // sort czyli sortowanie listy
        Collections.sort(nazwaListy);
        System.out.println(nazwaListy);
//        szukanie indexu danego elementu w liście
        int indexKonia = nazwaListy.indexOf("Koń");
        System.out.println(indexKonia);
        nazwaListy.set(indexKonia,"Koń2333");
        System.out.println(nazwaListy);
    }
}
