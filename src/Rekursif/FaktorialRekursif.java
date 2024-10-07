package Rekursif;
public class FaktorialRekursif {
    public static int hitungFaktorial(int n) {
        if (n == 0) {                                           //kasus basis
            return 1;
        } else {                                                //kasus berulang
            return n * hitungFaktorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int hasilFaktorial = hitungFaktorial(n);
        System.out.println("Faktorial dari " + n + " adalah " + hasilFaktorial);
    }
}