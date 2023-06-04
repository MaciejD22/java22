package Lekcja5_OOP_przykład;

public class Metody {

//    Tworzenie metody
//    typZwracanyPrzezMetode nazwaMałąLiterą(opcjonalnie Parametry){
//    Ciało Metody - czyli część wykonywalna przez metodę
//    }

//    Metody z void <- typZwracany "nie zwracaj nic", czyli jeśli nie chcemy by coś zwracała ( robiła return)

    void metodaNicNieZwracająca(){
        System.out.println("Print z metody metodaNicNieZwracająca, aktualizacja");
    }

    void metodaZParametrem(int a){
//        podając wartość parametru otrzymujemy argument na którym możemy wykonywać różne operacje
//        możemy argument a zwiększyć o 1 tzn. inkrementacja a++
        System.out.println("Print z metoy z Parametrem: " + a);
    }

    void metodaZBoolean(boolean CzyPokazać, int liczba){
        if(CzyPokazać){
            System.out.println("Liczba wynosi: " + liczba);
        } else {
            System.out.println("Nie mogę pokazać liczby.");
        }
    }
// metoda bez voida to znaczy taka coś zwracająca (return)
    int dodawanie(int a, int b){
        int wynik = a + b;
        return wynik;
    }
    double liczbyPoPrzecinku(double liczbaDouble){
        double wynik = liczbaDouble + 0.5;
        return wynik;
    }
    boolean zmianaWartościLogicznej(boolean wartośćLogiczna){
        return !wartośćLogiczna;
    }

    int zwracającaZWartościąLogiczną(boolean wartośćLogiczna, int a){
        if(wartośćLogiczna){
            System.out.println("Wartość logiczna jest: " + wartośćLogiczna);
            return a;
        } else {
            return 0;
        }
    }
}
