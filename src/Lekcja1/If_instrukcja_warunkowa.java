package Lekcja1;

public class If_instrukcja_warunkowa {
    public static void main(String[] args) {
        int x = 10;
//      Instrukcja warunkowa IF wykonuje { blok kodu } jeśli podany ( warunek ) jest prawdziwy tzn. zwrac true
        if (x>100){
            System.out.println("Warunek jest prawdziwy");
        }
//        else if sprawdza kolejny warunek i robi to co if
        else if (x>50){
            System.out.println("Pierwszy Else if ma spełniony warunek tzn. wartość true");
        }
        else if (x>5) {
            System.out.println("Drugi Else If się spełnił");
        }
//        else wykonuje się jeśli żadn z warunków if lub else if nie spełni się tzn. wszystkie mają false
        else {
            System.out.println("wykonuje nam się else, żaden z poprzednich warunków nie spełnił się");
        }
    }
}
