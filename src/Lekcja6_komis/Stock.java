package Lekcja6_komis;

import java.util.ArrayList;
import java.util.*;

public class Stock {

    private List<Samochody> ListaSamochodów = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void addCar(){
        System.out.println("Podaj markę samochodu: ");
        String marka = scanner.next();

        System.out.println("Podaj model samochodu: ");
        String model = scanner.next();

        System.out.println("Podaj rok produkcji: ");
        int rocznik = scanner.nextInt();

        System.out.println("Podaj aktualny przebieg: ");
        int przebieg = scanner.nextInt();

        System.out.println("Podaj cenę samochodu: ");
        int cena = scanner.nextInt();

        Samochody samochód = new Samochody(marka, model, rocznik, przebieg, cena);
        ListaSamochodów.add(samochód);
    }

    public void displayCar(){
        for(Samochody samochód : ListaSamochodów ){
            samochód.carInformation();
            System.out.println();
        }
    }

    public void liczbaSamochodówNaStocku(){
        System.out.println("Aktualana liczba samochodów w komisie: " + ListaSamochodów.size());
    }


}
