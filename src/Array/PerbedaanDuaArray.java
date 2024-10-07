package Array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PerbedaanDuaArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] baris1 = scanner.nextLine().split(" ");
        String[] baris2 = scanner.nextLine().split(" ");

        int[] angkaBaris1 = new int[baris1.length];
        int[] angkaBaris2 = new int[baris2.length];

        for (int i = 0; i < baris1.length; i++) {
            angkaBaris1[i] = Integer.parseInt(baris1[i]);
        }

        for (int i = 0; i < baris2.length; i++) {
            angkaBaris2[i] = Integer.parseInt(baris2[i]);
        }

        //System.out.print("Angka-angka yang berbeda: ");
        for (int angka : angkaBaris1) {
            if (!adaDiArray(angka, angkaBaris2)) {
                System.out.print(angka + " ");
            }
        }

        for (int angka : angkaBaris2) {
            if (!adaDiArray(angka, angkaBaris1)) {
                System.out.print(angka + " ");
            }
        }
    }

    public static boolean adaDiArray(int angka, int[] array) {
        for (int elemen : array) {
            if (angka == elemen) {
                return true;
            }
        }
        return false;
    }
}

/*
public class PerbedaanElemen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] baris1 = scanner.nextLine().split(" ");
        String[] baris2 = scanner.nextLine().split(" ");

        int[] angkaBaris1 = new int[baris1.length];
        int[] angkaBaris2 = new int[baris2.length];

        for (int i = 0; i < baris1.length; i++) {
            angkaBaris1[i] = Integer.parseInt(baris1[i]);
        }

        for (int i = 0; i < baris2.length; i++) {
            angkaBaris2[i] = Integer.parseInt(baris2[i]);
        }

        System.out.print("Angka-angka yang berbeda: ");
        for (int angka : angkaBaris1) {
            if (!adaDiArray(angka, angkaBaris2)) {
                System.out.print(angka + " ");
            }
        }

        for (int angka : angkaBaris2) {
            if (!adaDiArray(angka, angkaBaris1)) {
                System.out.print(angka + " ");
            }
        }
    }

    public static boolean adaDiArray(int angka, int[] array) {
        for (int elemen : array) {
            if (angka == elemen) {
                return true;
            }
        }
        return false;
    }
 */

/* Scanner scanner = new Scanner(System.in);

        // Input pertama
        System.out.println("Masukkan baris pertama angka (pisahkan dengan spasi):");
        String baris1 = scanner.nextLine();

        // Input kedua
        System.out.println("Masukkan baris kedua angka (pisahkan dengan spasi):");
        String baris2 = scanner.nextLine();

        // Mengonversi input menjadi himpunan angka
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Memasukkan angka dari baris pertama ke dalam set1
        for (String s : baris1.split(" ")) {
            set1.add(Integer.parseInt(s));
        }

        // Memasukkan angka dari baris kedua ke dalam set2
        for (String s : baris2.split(" ")) {
            set2.add(Integer.parseInt(s));
        }

        // Mencari perbedaan antara dua himpunan
        Set<Integer> hasil = new HashSet<>(set1);
        hasil.addAll(set2); // Gabungkan kedua himpunan
        Set<Integer> irisan = new HashSet<>(set1);
        irisan.retainAll(set2); // Simpan irisan (angka yang ada di kedua himpunan)
        hasil.removeAll(irisan); // Hapus irisan dari gabungan

        // Menampilkan hasil
        System.out.println("Angka yang berbeda di antara dua baris:");
        for (int angka : hasil) {
            System.out.print(angka + " ");
        }

         */