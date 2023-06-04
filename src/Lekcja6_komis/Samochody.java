package Lekcja6_komis;

public class Samochody {
    private String marka;
    private String model;
    private int rocznik;
    private int przebieg;
    private int cena;

    public Samochody(String marka, String model, int rocznik, int przebieg, int cena) {
        this.marka = marka;
        this.model = model;
        this.rocznik = rocznik;
        this.przebieg = przebieg;
        this.cena = cena;
    }

public void carInformation(){
    System.out.println("Marka: " + marka);
    System.out.println("Model: " + model);
    System.out.println("Rocznik: " + rocznik);
    System.out.println("Przebieg: " + przebieg);
    System.out.println("Cena: " + cena);
}
}
