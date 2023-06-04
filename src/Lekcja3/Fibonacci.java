package Lekcja3;

import java.util.Scanner;

public class Fibonacci {

    public static int Liczba;
    public static int fibonacciRecursion(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
    }
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ile liczb sekwencji Fibonacci chcesz zobaczyć");
        Liczba = scanner.nextInt();

        System.out.print("Sekwecja Fibonacci  "+ Liczba +" liczb: ");
        for(int i = 0; i < Liczba; i++){
            System.out.print(fibonacciRecursion(i) +" ");
        }
    }
}