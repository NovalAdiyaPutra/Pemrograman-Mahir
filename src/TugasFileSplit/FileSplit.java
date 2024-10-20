package TugasFileSplit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FileSplit {
    public static String bacaFile(String pathFile) throws FileNotFoundException {
        StringBuilder kontenFile = new StringBuilder();
        File file = new File(pathFile);
        Scanner fileScanner = new Scanner(file);

        while (fileScanner.hasNextLine()) {
            kontenFile.append(fileScanner.nextLine()).append("\n");
        }
        fileScanner.close();

        return kontenFile.toString();
    }

    public static Queue<String> potongTeks(String teks, int ukuranBagian) {
        Queue<String> bagianQueue = new LinkedList<>();
        Scanner teksScanner = new Scanner(teks);
        StringBuilder bagian = new StringBuilder();
        int jumlahBaris = 0;

        while (teksScanner.hasNextLine()) {
            bagian.append(teksScanner.nextLine()).append("\n");
            jumlahBaris++;

            if (jumlahBaris == ukuranBagian) {
                bagianQueue.add(bagian.toString());
                bagian.setLength(0);
                jumlahBaris = 0;
            }
        }

        if (bagian.length() > 0) {
            bagianQueue.add(bagian.toString());
        }

        teksScanner.close();
        return bagianQueue;
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan path file (misalnya: resources/contoh.txt): ");
            String pathFile = inputScanner.nextLine();

            String teks = bacaFile(pathFile);

            System.out.print("Masukkan ukuran bagian (jumlah baris per bagian): ");
            int ukuranBagian = inputScanner.nextInt();

            Queue<String> bagianQueue = potongTeks(teks, ukuranBagian);

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
