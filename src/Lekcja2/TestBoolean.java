package Lekcja2;

import java.util.Scanner;

public class TestBoolean {
    public static void main(String[] args) {

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Zagdnij jakie zwierzę mam na myśli?: ");
            String animal = scan.next();
            boolean test = animal.equals("kot");

//            Możemy zrobić test logiczny do zakończenia naszej nieskończonej pętli for czy while(true)
            if (test) {
                System.out.println("Brawo! Zgadłeś!\n");
                break;
            } else {
                System.out.println("Nie zgadłeś! Spróbuj jeszcze raz.");
            }
        }
    }
}
