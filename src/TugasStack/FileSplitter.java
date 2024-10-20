package TugasStack;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FileSplitter {
    // Method untuk membaca isi file dan mengembalikannya sebagai sebuah string
    public static String bacaFile(String pathFile) throws FileNotFoundException {
        StringBuilder kontenFile = new StringBuilder();
        File file = new File(pathFile);
        Scanner fileScanner = new Scanner(file);

        // Membaca file baris per baris
        while (fileScanner.hasNextLine()) {
            kontenFile.append(fileScanner.nextLine()).append("\n");
        }
        fileScanner.close();

        return kontenFile.toString();
    }

    // Method untuk memotong teks menjadi beberapa bagian berdasarkan jumlah baris
    public static Queue<String> potongTeks(String teks, int ukuranBagian) {
        Queue<String> bagianQueue = new LinkedList<>();
        Scanner teksScanner = new Scanner(teks);
        StringBuilder bagian = new StringBuilder();
        int jumlahBaris = 0;

        // Membaca teks baris per baris dan memotong sesuai dengan ukuranBagian
        while (teksScanner.hasNextLine()) {
            bagian.append(teksScanner.nextLine()).append("\n");
            jumlahBaris++;

            // Jika sudah mencapai jumlah baris yang diinginkan, tambahkan ke Queue
            if (jumlahBaris == ukuranBagian) {
                bagianQueue.add(bagian.toString());
                bagian.setLength(0); // Reset StringBuilder untuk bagian selanjutnya
                jumlahBaris = 0;
            }
        }

        // Menambahkan sisa baris yang belum masuk ke bagian
        if (bagian.length() > 0) {
            bagianQueue.add(bagian.toString());
        }

        teksScanner.close();
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

            // Meminta input ukuran potongan (jumlah baris per bagian)
            System.out.print("Masukkan ukuran bagian (jumlah baris per bagian): ");
            int ukuranBagian = inputScanner.nextInt();

            // Memotong teks menjadi beberapa bagian
            Queue<String> bagianQueue = potongTeks(teks, ukuranBagian);

            // Menampilkan setiap bagian
            int bagianKe = 1;
            while (!bagianQueue.isEmpty()) {
                System.out.println("\nBagian " + bagianKe + ":");
                System.out.println(bagianQueue.poll());
                bagianKe++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan. Pastikan path file benar.");
        } finally {
            inputScanner.close();
        }
    }
}
