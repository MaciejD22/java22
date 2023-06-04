package Lekcja4_OOP.Dziedziczenie_Klas;

public class KlasaMain {
    public static void main(String[] args) {
//        Klasy mogą dziedziczyć pola i metody z innych klas.
//        Dziedizczenia działa w jedną stronę (tak jak w naturze syn dziedziczy po ojcu, ojciec po dziadku)
        PodstawowaKlasa obiektKlasaPodstawowa = new PodstawowaKlasa();

        RozszerzonaKlasa obiektKlasaRozszerzona = new RozszerzonaKlasa();

        obiektKlasaPodstawowa.metodaZKlasyPodstawowej();
        obiektKlasaRozszerzona.metodaZKlasyRozszerzonej();

        System.out.println("Obiekt z klasy rozszerzonej, używający metody z klasy podstawowej ");
        obiektKlasaRozszerzona.metodaZKlasyPodstawowej(); // możemy dziedziczyć metody
        obiektKlasaRozszerzona.namePodstawowa = "Ania"; // możemy dziedziczyć też pola

        obiektKlasaPodstawowa.metodaDoNadpisania(20);
        obiektKlasaRozszerzona.metodaDoNadpisania(20);


    }
}
