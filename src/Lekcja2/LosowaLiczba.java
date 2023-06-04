package Lekcja2;

// żeby używać naszej liczby losowej musimy zaimportować bibliotekę Random
import java.util.Random;

public class LosowaLiczba {
    public static void main(String[] args) {
        Random random = new Random();
//        używamy Random by stworzyc integer'a     tutaj podajemy zakres liczb
        int losowaLiczbaCałkowita = random.nextInt(100);

        System.out.println(losowaLiczbaCałkowita);

    }
}
