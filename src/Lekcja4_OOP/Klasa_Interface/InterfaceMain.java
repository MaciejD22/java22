package Lekcja4_OOP.Klasa_Interface;

public class InterfaceMain implements Interface1, Interface2 {
    public static void main(String[] args) {

//        Interface1 obiekt = new Interface1() {
//            @Override
//            public void metodaInterface1() {
//
//            }
//        };
//
//        obiekt.metodaInterface1();
//        NIE TWORZYMY OBIEKTÓW NA PODSTAWIE KLASY INTERRFACE!

//      Obiekt możemy stworzyć na podstawie klasy, która implementuje interface
        InterfaceMain obiekt = new InterfaceMain();

        obiekt.metodaInterface1();


    }

    @Override
    public void metodaInterface1() {
        System.out.println("Metoda Interface1");
    }

    @Override
    public void metodaInterface2() {

    }
}
