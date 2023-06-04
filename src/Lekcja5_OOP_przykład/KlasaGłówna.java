package Lekcja5_OOP_przykład;

public class KlasaGłówna {
    public static void main(String[] args) {

        //    Klasy czyli ang. class możemy wykorzystywać w różny sposób
//    Jak ją tworzyć
// Tworzymy nowy obiekt na podstawie klasy - Moja Klasa mając do wykorzystania
// wszystkie jego cechy z klasy MojaKlasa
        MojaKlasa obiektMojaKlasa = new MojaKlasa();
        obiektMojaKlasa.metodaDruga();

//        Możemy tworzyć wiele obiektów na podstawie jednej klasy
        MojaKlasa obiektDrugiMojaKlasa = new MojaKlasa();
        obiektDrugiMojaKlasa.metodaPrzykładowa();

        Metody obiektKlasyMetody = new Metody();
        obiektKlasyMetody.metodaNicNieZwracająca();
        obiektKlasyMetody.metodaZParametrem(2);
        obiektKlasyMetody.metodaZBoolean(false,4);
        obiektKlasyMetody.dodawanie(2,2);
        obiektKlasyMetody.liczbyPoPrzecinku(10);
        obiektKlasyMetody.zmianaWartościLogicznej(true);

        int wynikDodawania = obiektKlasyMetody.dodawanie(2,2);
        System.out.println("Wynik dodawania = " + wynikDodawania);

        double wynikLiczbyPoPrzecinku = obiektKlasyMetody.liczbyPoPrzecinku(10.0);
        System.out.println("Wynik dodawania po przecinku = " + wynikLiczbyPoPrzecinku);

        System.out.println("Zmiana wartości logicznej: " + obiektKlasyMetody.zmianaWartościLogicznej(true));
        System.out.println(obiektKlasyMetody.zwracającaZWartościąLogiczną(true,1));

//        POLA KLASY
        Pola obiektKlasyPola = new Pola();
        obiektKlasyPola.wiek = 20;
        obiektKlasyPola.imie = "Adam";
        obiektKlasyPola.nazwisko = "Doe";
        System.out.println(obiektKlasyPola.wiek);

        obiektKlasyPola.pokażPola();
        obiektKlasyPola.ustawWiek(50);
        obiektKlasyPola.pokażPola();

        Pola pracownik1 = new Pola();
        pracownik1.dodajPracownika("Maria","Osa",27,"90123012345");

        Pola pracownik2 = new Pola();
        pracownik2.dodajPracownika("Adam", "Kowal", 25,"90121012345");

        Pola pracownik3 = new Pola();
        pracownik3.dodajPracownika("Przemek", "Ozimek", 27, "91102909876");

        pracownik1.pokażPola();
        pracownik2.pokażPola();
        pracownik3.pokażPola();



    }


}
