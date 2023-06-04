package Lekcja8_Zadania.Pracownicy;

public class Kierownicy extends Pracownicy{

    String nazwaDziału;

    Kierownicy(String name, String surname, String nazwaDziału) {
        super(name, surname);
        this.nazwaDziału = nazwaDziału;
    }

    public void wyświetlKierownika(){
        System.out.println("Imię: " + name);
        System.out.println("Nazwisko: " + surname);
        System.out.println("Kierownik działu: " + nazwaDziału);
    }

}
