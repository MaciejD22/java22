package Lekcja7.Wątki.Podstawy;

import Lekcja4_OOP.Klasa_Interface.Interface1;
import Lekcja4_OOP.Klasa_Interface.Interface2;

public class Wątek3 implements Runnable, Interface1, Interface2 {
// Interface Runnable przy tworzeniu wątków jest bardzo przydatny.
// Możemy implementować wiele interfejsów w odróznieniu do dziedziczenia gdzie dzieddziczyć możemy tylko 1 klasę.
//    Pozwoli to nam w naszym wątku na rozbudowanie funkcjonalności do czynności które ma wykonywać

    @Override
    public void run() {
        for (double i = 0; i < 1000; i++)
            System.out.println("Pętla wątek 3: " + i);
    }

    @Override
    public void metodaInterface1() {

    }

    @Override
    public void metodaInterface2() {

    }
}
