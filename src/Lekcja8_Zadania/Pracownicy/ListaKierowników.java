package Lekcja8_Zadania.Pracownicy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaKierowników {

    Scanner scanner = new Scanner(System.in);

    private List<Kierownicy> listaKierowników = new ArrayList<>();

    public void dodajKierownika(){
        System.out.println("Podaj imię kierownika: ");
        String name = scanner.next();

        System.out.println("Podaj nazwisko kierownika: ");
        String surname = scanner.next();

        System.out.println("Podaj za jaki dział jest odpowiedzialny: ");
        String nazwaDziału = scanner.next();

        Kierownicy nowyKierownik = new Kierownicy(name, surname,nazwaDziału);

        listaKierowników.add(nowyKierownik);
    }

    public void wyświetlWszystkichKierowników(){
        int a = 0;
        for(Kierownicy listaK : listaKierowników){
            System.out.println("Numer kierownika: " + a);
            listaK.wyświetlKierownika();
            a++;
        }
        System.out.println("Liczba wszystkich kierowników: " + a);
    }


}
