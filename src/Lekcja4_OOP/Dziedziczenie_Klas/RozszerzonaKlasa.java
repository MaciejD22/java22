package Lekcja4_OOP.Dziedziczenie_Klas;

public class RozszerzonaKlasa extends PodstawowaKlasa{

    int wzrostRozszerzona;
    String kolorOczyRozszerzona;
    void metodaZKlasyRozszerzonej(){
        System.out.println("Metoda z klasy Rozszerzonej");
    }

    @Override // Override sprawdza nam czy nadpisujemy metodę z klas z których dziedziczymy i czy zrobiliśmy to bez błędu
    void metodaDoNadpisania(int a){
        System.out.println("Klasa Rozszerzona, metoda do nadpisania" + a);
    }
}
