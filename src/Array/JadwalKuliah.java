package Array;

import java.util.ArrayList;
import java.util.Scanner;
public class JadwalKuliah {
    private ArrayList<MataKuliah> jadwalKuliah = new ArrayList<>();
    // Menambahkan mata kuliah ke dalam jadwal
    public void tambahJadwal(MataKuliah mataKuliah) {
        jadwalKuliah.add(mataKuliah);
    }

    // Menampilkan jadwal untuk seluruh mata kuliah
    public void tampilkanSemuaJadwal() {
        if (jadwalKuliah.isEmpty()) {
            System.out.println("Belum ada jadwal kuliah yang tersimpan.");
        } else {
            for (MataKuliah mk : jadwalKuliah) {
                System.out.println(mk);
            }
        }
    }

    // Menampilkan jadwal untuk hari ini
    public void tampilkanJadwalHariIni(String hariIni) {
        boolean ditemukan = false;
        for (MataKuliah mk : jadwalKuliah) {
            if (mk.hari.equalsIgnoreCase(hariIni)) {
                System.out.println(mk);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah untuk hari ini.");
        }
    }

    // Reset jadwal untuk semester baru
    public void resetJadwal() {
        jadwalKuliah.clear();
        System.out.println("Jadwal kuliah telah di-reset untuk semester baru.");
    }

    // Mengimpor jadwal baru (misalnya dari input pengguna atau sumber lain)
    public void imporJadwalBaru() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jumlah mata kuliah yang ingin diimpor:");
        int jumlah = scanner.nextInt();
        scanner.nextLine();  // Konsumsi newline

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan nama mata kuliah:");
            String nama = scanner.nextLine();
            System.out.println("Masukkan hari kuliah:");
            String hari = scanner.nextLine();
            System.out.println("Masukkan waktu kuliah:");
            String waktu = scanner.nextLine();
            System.out.println("Masukkan ruang kuliah:");
            String ruang = scanner.nextLine();
            System.out.println("Masukkan nama dosen (opsional):");
            String dosen = scanner.nextLine();
            System.out.println("Masukkan tipe kuliah (teori/praktikum/seminar):");
            String tipe = scanner.nextLine();

            // Menambahkan jadwal baru ke dalam array
            MataKuliah mk = new MataKuliah(nama, hari, waktu, ruang, dosen, tipe);
            tambahJadwal(mk);
        }

        System.out.println("Jadwal kuliah baru berhasil diimpor.");
    }

    public static void main(String[] args) {
        JadwalKuliah aplikasi = new JadwalKuliah();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Aplikasi Jadwal Kuliah =====");
            System.out.println("1. Tambah Jadwal Kuliah");
            System.out.println("2. Tampilkan Semua Jadwal");
            System.out.println("3. Tampilkan Jadwal Hari Ini");
            System.out.println("4. Reset Jadwal untuk Semester Baru");
            System.out.println("5. Impor Jadwal Baru");
            System.out.println("6. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();  // Konsumsi newline

            switch (pilihan) {
                case 1:
                    // Menambahkan jadwal baru
                    aplikasi.imporJadwalBaru();
                    break;
                case 2:
                    // Menampilkan semua jadwal
                    aplikasi.tampilkanSemuaJadwal();
                    break;
                case 3:
                    // Menampilkan jadwal untuk hari ini
                    System.out.print("Masukkan hari ini: ");
                    String hariIni = scanner.nextLine();
                    aplikasi.tampilkanJadwalHariIni(hariIni);
                    break;
                case 4:
                    // Reset jadwal untuk semester baru
                    aplikasi.resetJadwal();
                    break;
                case 5:
                    // Impor jadwal baru
                    aplikasi.imporJadwalBaru();
                    break;
                case 6:
                    // Keluar
                    System.out.println("Keluar dari aplikasi.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}