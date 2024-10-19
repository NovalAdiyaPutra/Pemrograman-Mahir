package TugasStack;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FileSplitter {

    // Fungsi untuk membaca isi file dan mengembalikan teks sebagai String
    public static String bacaFile(String pathFile) throws FileNotFoundException {
        StringBuilder kontenFile = new StringBuilder();
        File file = new File(pathFile);
        Scanner fileScanner = new Scanner(file);

        // Membaca isi file baris demi baris
        while (fileScanner.hasNextLine()) {
            kontenFile.append(fileScanner.nextLine()).append("\n");
        }
        fileScanner.close();

        return kontenFile.toString();
    }

    // Fungsi untuk memotong teks menjadi beberapa bagian dan menyimpannya dalam Queue
    public static Queue<String> potongTeks(String teks, int ukuranBagian) {
        Queue<String> bagianQueue = new LinkedList<>();
        int panjangTeks = teks.length();
        int indeksMulai = 0;

        // Memotong teks berdasarkan ukuranBagian dan memasukkannya ke dalam Queue
        while (indeksMulai < panjangTeks) {
            int indeksAkhir = Math.min(indeksMulai + ukuranBagian, panjangTeks);
            String bagian = teks.substring(indeksMulai, indeksAkhir);
            bagianQueue.add(bagian);
            indeksMulai = indeksAkhir;
        }

        return bagianQueue;
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        try {
            // Meminta input path file dari pengguna
            System.out.print("Masukkan path file (misalnya: resources/contoh.txt): ");
            String pathFile = inputScanner.nextLine();

            // Membaca isi file
            String teks = bacaFile(pathFile);

            // Meminta input ukuran bagian dari pengguna
            System.out.print("Masukkan ukuran bagian (jumlah karakter per bagian): ");
            int ukuranBagian = inputScanner.nextInt();

            // Memotong file menjadi beberapa bagian
            Queue<String> bagianQueue = potongTeks(teks, ukuranBagian);

            // Menampilkan hasil potongan teks
            int bagianKe = 1;
            while (!bagianQueue.isEmpty()) {
                System.out.println("\nBagian " + bagianKe + ":");
                System.out.println(bagianQueue.poll()); // Mengambil dan menampilkan setiap bagian dari Queue
                bagianKe++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan. Pastikan path file benar.");
        } finally {
            inputScanner.close();
        }
    }
}
