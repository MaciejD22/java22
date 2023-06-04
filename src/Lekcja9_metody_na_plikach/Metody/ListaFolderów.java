package Lekcja9_metody_na_plikach.Metody;

import java.io.File;

public class ListaFolderów {
    public static void main(String[] args) {
// Najprostszy sposób na wyświetlenie wszystkich plików i folderów w danej lokalizacji/folderze
        File plik = new File("src/Lekcja9_metody_na_plikach");
        String[] listaPlików = plik.list();
        for (String name:listaPlików){
            System.out.println(name);
        }

    }
}
