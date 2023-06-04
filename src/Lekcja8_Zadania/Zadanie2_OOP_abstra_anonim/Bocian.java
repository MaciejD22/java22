package Lekcja8_Zadania.Zadanie2_OOP_abstra_anonim;

public class Bocian extends Ptaki{

    @Override
    public void rozpiętośćSkrzydeł() {
        System.out.println("Rozpiętość skrzydeł od 100 do 140 cm");
    }

    @Override
    public void waga() {
        System.out.println("Waga do 10 KG");
    }
}
