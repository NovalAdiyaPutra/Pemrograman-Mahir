package Rekursif;

public class FibonaciRekursif1 {
    public static void main(String[] args) {
        System.out.println( f (6));
    }

    public static int f(int n) {
        if ( n==0 ){
            return 0;
        }else if ( n==1 ) {
            return 1;
        }else{
            return f(n-1) + f(n-2);
        }
    }
}
