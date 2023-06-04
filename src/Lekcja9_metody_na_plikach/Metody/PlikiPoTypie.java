package Lekcja9_metody_na_plikach.Metody;

import java.io.File;
import java.io.FilenameFilter;

public class PlikiPoTypie {
    public static void main(String[] args) {

        File plik = new File("src/Lekcja9_metody_na_plikach");
        //Jeśli chcemy wyświetliśc pliki danego typu używamy FilenameFilter przy piście plików
        String[] listaPlików = plik.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
//                Tworzymy instrukcję warunkową if i podajemy rodzaj plików np. .txt lub .java
                if (name.toLowerCase().endsWith(".txt")) {return true;} else {return false;}
            }
        });
// wyświetlamy listę plików
        for(String name:listaPlików){
            System.out.println(name);
        }
    }
}

