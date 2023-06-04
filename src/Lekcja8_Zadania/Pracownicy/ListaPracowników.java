package Lekcja8_Zadania.Pracownicy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaPracowników {

    Scanner scanner = new Scanner(System.in);

    private List<Pracownicy> listaPracowników = new ArrayList<>(); // ArrayList czyli lista dynamiczna więc możemy do niej dodawać nowe elementy

    public void dodajPracownika(){
        System.out.println("Podaj imię nowego pracownika: ");
        String name = scanner.next();

        System.out.println("Podaj nazwisko nowego pracownika: ");
        String surname = scanner.next();

        Pracownicy nowyPracownik = new Pracownicy(name, surname); // Tworzymy nowy obiekt na podstawie pól z klasy Pracownicy

        listaPracowników.add(nowyPracownik); // dodajemy obiekt do listy
    }

    public void wyświetlWszystkichPracowników(){
        int a = 0;
        for(Pracownicy listaP: listaPracowników){
            System.out.println("Numer pracownika: " + (a+1));
            listaP.wyświetlPracownika();
            a++;
        }
        System.out.println("Liczba wszystkich pracowników: " + a);
    }

}
