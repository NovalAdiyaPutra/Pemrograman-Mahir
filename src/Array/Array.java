package Array;

public class Array {
    public static void main(String[] args) {
        int [] nilai  = {90, 96, 80, 88, 75}; //90 itu array ke 0

        int jumlah = 0;
        for (int i = 0; i < nilai.length; i++) {
            jumlah += nilai[i];
        }

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai " + i + " = " +nilai[i]);
        }

        System.out.println("Jumlah = " + jumlah);
    }
}
