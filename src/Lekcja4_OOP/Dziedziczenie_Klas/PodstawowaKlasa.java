package Lekcja4_OOP.Dziedziczenie_Klas;

public class PodstawowaKlasa{
    String namePodstawowa;
    int wiekPodstawowa;

    void metodaZKlasyPodstawowej() {
        System.out.println("Metoda z klasy podstawowej");
    }

    void metodaDoNadpisania(int a){
        System.out.println("Klasa Podstawowa, metoda do nadpisania" + a);
    }
}
