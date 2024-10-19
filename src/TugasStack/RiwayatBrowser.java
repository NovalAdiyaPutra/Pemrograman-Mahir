package TugasStack;
import java.util.Scanner;
import java.util.Stack;

public class RiwayatBrowser {
    // Menggunakan Stack untuk menyimpan riwayat
    private Stack<String> riwayat;

    // Konstruktor
    public RiwayatBrowser() {
        riwayat = new Stack<>();
    }

    // Fungsi untuk menambahkan website baru ke riwayat (browse)
    public void jelajah(String website) {
        riwayat.push(website);
        System.out.println("Menjelajah ke: " + website);
    }

    // Fungsi untuk kembali ke website sebelumnya dan menghapus riwayat terakhir (back)
    public void kembali() {
        if (riwayat.isEmpty()) {
            System.out.println("Tidak ada riwayat untuk kembali!");
        } else {
            System.out.println("Kembali dari: " + riwayat.pop());
        }
    }

    // Fungsi untuk menampilkan semua riwayat dari yang paling baru (view)
    public void lihat() {
        if (riwayat.isEmpty()) {
            System.out.println("Tidak ada riwayat penjelajahan.");
        } else {
            System.out.println("Riwayat Penjelajahan:");
            for (int i = riwayat.size() - 1; i >= 0; i--) {
                System.out.println(riwayat.get(i));
            }
        }
    }

    public static void main(String[] args) {
        RiwayatBrowser riwayatBrowser = new RiwayatBrowser();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n--- Browser Menu ---");
            System.out.println("1. Browse website");
            System.out.println("2. View history");
            System.out.println("3. Back");
            System.out.println("4. Exit");
            System.out.print("Pilih Opsi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();  // Konsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan URL website: ");
                    String website = scanner.nextLine();
                    riwayatBrowser.jelajah(website);
                    break;
                case 2:
                    riwayatBrowser.lihat();
                    break;
                case 3:
                    riwayatBrowser.kembali();
                    break;
                case 4:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        } while (pilihan != 4);

        scanner.close();
    }
}

