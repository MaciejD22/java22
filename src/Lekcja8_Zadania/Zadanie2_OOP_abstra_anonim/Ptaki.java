package Lekcja8_Zadania.Zadanie2_OOP_abstra_anonim;
// punkt 1 stwórz klasę abstrakcyjną czyli dodaj abstract przy tworzeniu Klasy
public abstract class Ptaki {

    public void skrzydła(){
        System.out.println("Ptaki mają dwa skrzydła");
    }

    public void dziób(){
        System.out.println("Ptaki mają dzioby");
    }

    public void nogi(){
        System.out.println("Ptaki mają dwie nogi");
    }
// Poniżej są metody abstrakcyjne
    public abstract void rozpiętośćSkrzydeł();

    public abstract void waga();

    public static class WewnętrznaKlasa {
        public void gniazdo(){
            System.out.println("Każdy ptak buduje gniazdo.");
        }
    }






}
