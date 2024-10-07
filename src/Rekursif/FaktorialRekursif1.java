package Rekursif;

public class FaktorialRekursif1 {
    public static void main(String[] args) {
        int n = 5;
        int hasil = faktorial(n);
        System.out.println("Hasil = " + hasil);
    }
    public static int faktorial(int n) {
        if(n >= 1) {
            return n * faktorial(n-1);
        } else {
            return 1;
        }
    }
}
