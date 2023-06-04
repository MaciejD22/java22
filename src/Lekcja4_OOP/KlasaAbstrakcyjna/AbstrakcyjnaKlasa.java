package Lekcja4_OOP.KlasaAbstrakcyjna;
//Do tworzenia klasy abstrakcyjnej używamy słowa kluczowego "abstract" przed słowem "class"
public abstract class AbstrakcyjnaKlasa {
    public void rodzajSilnika(){
        System.out.println("Posiada silnik spalinowy.");
    }
    public void paliwo(){
        System.out.println("Rodzaj paliwa benzyna");}

    public abstract void napędNa();

    public abstract void skrzyniaBiegów();


}
