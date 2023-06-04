package Lekcja5_OOP_przykład;

import java.math.BigInteger;

// Pola ponieważ z angielskiego fields
public class Pola {
    int wiek;
    String pesel;
    String imie;
    String nazwisko;

    void pokażPola(){
        System.out.println("Imię: " + imie + "\nNazwisko: " + nazwisko + "\nWiek:" + wiek+"\n");
    }
    void ustawWiek(int wiekParmetr){
        wiek = wiekParmetr;
    }
    void dodajPracownika(String name, String surname, int age, String numerPESEL){
        imie = name;
        nazwisko = surname;
        wiek = age;
        pesel = numerPESEL;
    }
}
