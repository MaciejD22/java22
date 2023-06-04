package Lekcja8_Zadania.Zadanie2_OOP_abstra_anonim;

public class Orzeł extends Ptaki{
//    dziedzicząc klasę abstrakcyjną i metody abstrakcyjne musimy je zimplementować lub zadeklarować

    @Override
    public void rozpiętośćSkrzydeł() {
        System.out.println("Rozpiętość skrzydeł 100-160 cm");
    }

    @Override
    public void waga() {
        System.out.println("Waga od 5 do 12 KG");
    }
}
