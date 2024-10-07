package Rekursif;

public class FaktorialPerulangan {
    public static void main(String[] args) {
        int n = 5;
        int hasil = 1;
        for(int i = 1; i <= 5; i++) {
            hasil = hasil * i;
        }
        System.out.println("Faktorial dari " + n + " adalah " + hasil);
    }
}
