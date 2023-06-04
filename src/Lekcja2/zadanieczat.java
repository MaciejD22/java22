package Lekcja2;

import java.util.Scanner;

public class zadanieczat {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int a = scan.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int b = scan.nextInt();

        for (; a <=b; a++){
            System.out.print(a + " ");
        }
    }
}

