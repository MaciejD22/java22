package Lekcja1;

public class Tablice {
    public static void main(String[] args) {

//        Przy twrzeniu tablicy musimy najpierw zdefiniować jakie typu dane ma zawierać

        int[] tablicaLiczb = {1,2,3,4,5,6,7,8,9};
//                     index [0,1,2,3,4,5,6,7,8]
        System.out.println(tablicaLiczb[0]); // pierwszy elemet w liście
        System.out.println(tablicaLiczb[tablicaLiczb.length-1]); // ostatni element w liście

        String[] tablicaWyrazów = {"wyraz1", "wyraz2", "wyraz3"};
        System.out.println(tablicaWyrazów[0]);

//        zmienianie wartości elementu w tablicy
//        odwołujemy się po index'ie do elementu i przypisujemy mu nową wartość
        tablicaWyrazów[0] = "PierwszyWyraz";
        System.out.println(tablicaWyrazów[0]);
//        lenght służy do liczenia ilości elemntów w zbiorze
        System.out.println(tablicaWyrazów.length);
//
//        wyświetlanie wszystkich elementów tablicy
        for (int i = 0; i < tablicaWyrazów.length; i++){
            System.out.println(tablicaWyrazów[i]);
        }
// foreach wyświetlanie elementów tablicy przy użyciu foreach
        for ( String elementTalicy : tablicaWyrazów) {
            System.out.println(elementTalicy);
        }

//        Tworzenie pustej Tablicy i wypełnianie jej wartościami
//        tworzymy obiekt typu tablica integerów = new czyli tworzymy nową o liczbie elementów 10 i ich typie int
        int[] pustaTablica = new int[10];
        for ( int i = 0; i < 10; i++)
            pustaTablica[i] = i+1;

        for (int elementPustaTablica : pustaTablica) {
            System.out.println("to jest element pustaTablica: " + elementPustaTablica);
            
        }



        }






}
