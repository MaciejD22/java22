package Lekcja8_Zadania.Pracownicy;

public class Pracownicy {
    String name;
    String surname;

    Pracownicy(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public void wyświetlPracownika(){
        System.out.println("Imię: " + name);
        System.out.println("Nazwisko: " + surname);
    }
}
