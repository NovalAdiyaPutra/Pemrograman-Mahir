package Rekursif;

public class FibonaciRekursif {
    public static void main(String[] args) {
        int n = 8;
        System.out.println("Fibonacci ke 8 adalah " + F(n));
    }

    // bagian rekursif
    public static int F(int n) {
        if(n > 1) {
            return F(n-1) + F(n-2);
        } else if(n == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
