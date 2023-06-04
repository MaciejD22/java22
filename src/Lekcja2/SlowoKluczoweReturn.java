package Lekcja2;

public class SlowoKluczoweReturn {

    static int metoda1(int x){
        return 2 + x;
    }

    public static String metodaString(String wyraz){
        return wyraz;
    }
    public static void main(String[] args) {
        System.out.println(metoda1(2));
        System.out.println(metoda1(5));
        System.out.println(metoda1(10));
        System.out.println(metodaString("Pies"));
    }
}
