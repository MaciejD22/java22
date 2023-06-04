package Lekcja2;

import java.util.Scanner;

public class ZadanieDzieńTygodnia {
    public static void main(String[] args) {
//        Zróbcie program któy prosi użytkownika o podanie dnia tygodnia, niech program
//        np wyświetla "dziś jest środa i idę n koszykówkę "
//     Jeśłi wpiszecie "end" to niech program się zakończy
        Scanner scan = new Scanner(System.in);
        System.out.println("Jaki mamy dzień tygodnia?");
//        zmiana wpisanego tekstu na małe litery
        String input = scan.next();
        String dzienTygodnia = input.toLowerCase();

//      test logiczny do wyłączania programu
        Boolean test = dzienTygodnia.equals("end");
//          ! użyliśy zaprzeczenia by pętla while działała jeśli wpiszemy cokolwiek innego niż "end"
        while(!test) {
            System.out.println("Jaki mamy dzień tygodnia?");
            if (dzienTygodnia.equals("poniedziałek")) {
                System.out.println("Dziś jest " + dzienTygodnia + " i idę do szkoły");
                break;
            } else if (dzienTygodnia.equals("wtorek")) {
                System.out.println("Dziś jest " + dzienTygodnia + " i muszę iść na zakupy");
                break;
            } else {
                System.out.println("Podaj jakiś dzień tygodnia");
                break;
            }
        }
    }
}
