package Rekursif;

public class UrutanRekursif {
    public static void main(String[] args) {
        System.out.println(cetak(9));
    }

    public static String cetak(int n) {
        if (n==1){
            return "1";
        }else {
            return cetak(n-1) + " " +n ;
        }
    }
}
