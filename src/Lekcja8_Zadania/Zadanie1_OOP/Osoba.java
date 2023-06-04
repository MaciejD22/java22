package Lekcja8_Zadania.Zadanie1_OOP;

public class Osoba {
    public String imie;
    public String nazwisko;

    public Osoba(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void przedstawSie(){
        System.out.println("Nazywam się " + imie + " " + nazwisko);
    }
}
