package Lekcja3;

public class RekurencjaPrzyklad2 {
    public static void main(String[] args) {
        System.out.println(sum(1, 5));
//        if ( 5 > 1)
//        return 5 + sum(1,4);
//        return 5 + 4 + sum(1,3);
//        return 5 + 4 + 3 + sum(1,2);
//        return 5 + 4 + 3 + 2 + sum(1,1) <- tutaj wchodzi warunek ELSE czyli daje end = 1
//        return 5 + 4 + 3 + 2 + 1
    }

    public static int sum(int start, int end){
        if ( end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }
}
