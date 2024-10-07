package Array;
import java.util.Scanner;

public class ElemenTerbesar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan angka :");
        String input = scanner.nextLine();
        String[] angkaStr = input.split(" ");
        int max = Integer.MIN_VALUE;
        for (String s : angkaStr) {
            int angka = Integer.parseInt(s);
            if (angka > max) {
                max = angka;
            }
        }
        System.out.println(max);
    }
}