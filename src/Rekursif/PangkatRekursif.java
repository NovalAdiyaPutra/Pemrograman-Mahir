package Rekursif;

public class PangkatRekursif {

    public static void main(String[] args) {
        System.out.println( pangkat (2,10));
    }

    public static double pangkat(int x, int n) {
        if (n == 0){
            return 1;
        } else if (n > 0) {
            return x * pangkat(x , n-1);
        }else {
            return 1 / pangkat(x, -n);
        }
    }
}