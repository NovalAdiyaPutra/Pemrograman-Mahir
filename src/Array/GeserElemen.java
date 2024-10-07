package Array;
import java.util.Scanner;

public class GeserElemen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int shift = scanner.nextInt();
        scanner.nextLine();

        String kalimat = scanner.nextLine();

        String[] kata = kalimat.split(" ");

        shift = shift % kata.length;

        String[] hasil = new String[kata.length];
        for (int i = 0; i < kata.length; i++) {
            int posisiBaru = (i + shift) % kata.length;
            hasil[posisiBaru] = kata[i];
        }

        for (String s : hasil) {
            System.out.print(s + " ");
        }

    }
}

/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int geser = scanner.nextInt();
        scanner.nextLine();

        String kalimat = scanner.nextLine();

        String[] kataArray = kalimat.split(" ");

        geser = geser % kataArray.length;

        String[] hasil = new String[kataArray.length];

        for (int i = 0; i < kataArray.length; i++) {
            int posisiBaru = (i + geser) % kataArray.length;
            hasil[posisiBaru] = kataArray[i];
        }

        for (String kata : hasil) {
            System.out.print(kata + " ");
        }
    }
 */