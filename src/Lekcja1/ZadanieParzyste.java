package Lekcja1;

public class ZadanieParzyste {
    public static void main(String[] args) {
        int i = 0;
        while(i<=20){
            i++;
            if (i%2==1){
                continue;
            }
            System.out.println(i);
        }
    }
}
