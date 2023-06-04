package Lekcja2;

import java.util.Scanner;

public class IfwIF {
    public static void main(String[] args) {
        int a, b, c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        b = scanner.nextInt();
        System.out.println("Podaj trzecią liczbę: ");
        c = scanner.nextInt();

        if (a >= b) {
            if (a >= c) {
                System.out.println("Największa liczba to: " + a);
            } else {System.out.println("Największa liczba to: " + c);}
        }
        else {
            if ( b >= c){
                System.out.println("Największa liczba to: " + b);
            } else {System.out.println("Największa liczba to: " + c);}
        }
    }
}
