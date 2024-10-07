package Rekursif;

public class FibonaciTailRekursif {
    public static void main(String[] args) {
        System.out.println(F(6));
    }

    public static int F(int n) {
        return fibo(0,1,n);
    }

    public static int fibo(int x, int y, int n) {
        if (n == 0){
            return x;
        }else if (n == 1){
            return y;
        }else{
            return fibo(y,x+y, n-1);
        }
    }
}
