package TugasBrowserHistory;
import java.util.Scanner;

public class AppBrowserHistory {
    public static void main(String[] args) {
        BrowserHistory riwayatBrowser = new BrowserHistory();
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
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan URL website: ");
                    String website = scanner.nextLine();
                    riwayatBrowser.browse(website);
                    break;
                case 2:
                    riwayatBrowser.view();
                    break;
                case 3:
                    riwayatBrowser.back();
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
