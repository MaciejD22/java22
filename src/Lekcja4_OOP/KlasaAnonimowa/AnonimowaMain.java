package Lekcja4_OOP.KlasaAnonimowa;

public class AnonimowaMain {
    public static void main(String[] args) {

        KolejnaKlasa obiektKlasyAnonimowej = new KolejnaKlasa(){
// przysłaniamy klasę
            @Override
            public void metodaKolejnaKlasa() {
                System.out.println("Nadpisujemy klasę");
            }
        }; // musimy dać ; przy klasie nonimowej

        obiektKlasyAnonimowej.metodaKolejnaKlasa();

//        klasa anonimowa użyta w parametrze metody
        KolejnaKlasa zwyklaKlasa = new KolejnaKlasa();

        przykładowaMetoda(new KolejnaKlasa(){

            @Override
            public void metodaKolejnaKlasa() {
                System.out.println("Tekst z przykladowaMetoda");
            }
        });





    }

    public static void przykładowaMetoda (KolejnaKlasa parametr){
        parametr.metodaKolejnaKlasa();
    }
}
