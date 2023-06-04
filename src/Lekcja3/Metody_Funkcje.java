package Lekcja3;

public class Metody_Funkcje {

//    Swoje metody definiujemy poza metodą Main
//          określamy typ metody czyli czy ma być widoczna poza samej siebie i czy ma coś zwracać
//    jeśli ne chcemy by zwracała wartość używamy słowa VOID
//    STATIC w nazwie metody oznacza, że mamy do niej dostęp bez tworzenia obiektu
//    typ, co ma zwracać, nazwa metody(argumenty metody){
//    kod wewnatrz metody to tzn. ciało metody z ang. method body
//    }
    public static void mojaFunkcja(){
            System.out.println("moja Funkcja wyświetla printa ");
    }

    public static void dodawanie(int a, int b){
        int suma = a + b;
        System.out.println("Wynik dodawania wynosi " + suma);
    }
// Metoda która zwraca nie ma VOID przed nazwą, musi mieć określony typ danych który zwraca
    public static int dodawanieReturn(int a, int b){
        int suma = a + b;
//        gdy metoda nie ma VOID musi byc return bo ma ona coś zwracać
        return suma;
    }

    public static void main(String[] args) {

            mojaFunkcja();
            dodawanie(1,2);
            dodawanie(4,5);
            dodawanie(120,340);
        System.out.println(dodawanieReturn(2,3));
    }
}