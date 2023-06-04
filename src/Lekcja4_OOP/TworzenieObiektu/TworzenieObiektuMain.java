package Lekcja4_OOP.TworzenieObiektu;

public class TworzenieObiektuMain {
    public static void main(String[] args) {

        KlasaZObiektami obiekt = new KlasaZObiektami(); //Tworzenie obiektu zaczynamy od nazwy Klasy na podstawie,
        // której chcemy stworzyć obiekt, następnie podajemy nazwę obiektu i po = używamy słowa kluczowego new

        obiekt.name = "Adam";
        obiekt.wiek = 18;
        obiekt.czyZaszczepiony = false;

        KlasaZObiektami obiekt2 = new KlasaZObiektami();
        obiekt2.name = "Maja";
        obiekt2.wiek = 19;
        obiekt2.czyZaszczepiony = true;


    }
}
