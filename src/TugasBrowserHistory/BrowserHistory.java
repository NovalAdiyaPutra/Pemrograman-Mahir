package TugasBrowserHistory;
import java.util.Scanner;
import java.util.Stack;

public class BrowserHistory {
    private Stack<String> riwayat;

    public BrowserHistory() {
        riwayat = new Stack<>();
    }

    public void browse(String website) {
        riwayat.push(website);
        System.out.println("Menjelajah ke: " + website);
    }

    public void back() {
        if (riwayat.isEmpty()) {
            System.out.println("Tidak ada riwayat untuk kembali!");
        } else {
            System.out.println("Kembali dari: " + riwayat.pop());
        }
    }

    public void view() {
        if (riwayat.isEmpty()) {
            System.out.println("Tidak ada riwayat penjelajahan.");
        } else {
            System.out.println("Riwayat Penjelajahan:");
            for (int i = riwayat.size() - 1; i >= 0; i--) {
                System.out.println(riwayat.get(i));
            }
        }
    }
}