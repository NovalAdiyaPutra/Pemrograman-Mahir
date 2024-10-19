package TugasStack;
import java.util.Stack;

public class TextEditor {
    // Stack untuk menyimpan teks saat ini (undo)
    private Stack<String> undoStack;
    // Stack untuk menyimpan teks yang dihapus (redo)
    private Stack<String> redoStack;
    // Variabel untuk menyimpan teks saat ini
    private String teksSaatIni;

    // Konstruktor
    public TextEditor() {
        undoStack = new Stack<>();
        redoStack = new Stack<>();
        teksSaatIni = "";
    }

    // Fungsi untuk menambahkan teks ke text editor (write)
    public void tulis(String teksBaru) {
        undoStack.push(teksSaatIni); // Simpan versi sebelumnya untuk undo
        teksSaatIni += teksBaru; // Tambahkan teks baru ke teks saat ini
        redoStack.clear(); // Setelah menulis teks baru, redo tidak bisa digunakan
        System.out.println("Teks ditambahkan: " + teksBaru);
    }

    // Fungsi untuk mengembalikan teks ke kondisi sebelumnya (undo)
    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Tidak ada yang bisa di-undo.");
        } else {
            redoStack.push(teksSaatIni); // Simpan versi saat ini untuk redo
            teksSaatIni = undoStack.pop(); // Kembalikan teks ke versi sebelumnya
            System.out.println("Undo dilakukan.");
        }
    }

    // Fungsi untuk memulihkan teks yang di-undo (redo)
    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Tidak ada yang bisa di-redo.");
        } else {
            undoStack.push(teksSaatIni); // Simpan versi saat ini untuk undo
            teksSaatIni = redoStack.pop(); // Pulihkan teks yang di-undo
            System.out.println("Redo dilakukan.");
        }
    }

    // Fungsi untuk menampilkan semua teks yang ada (show)
    public void tampilkan() {
        System.out.print("Teks Saat Ini: ");
        System.out.println(teksSaatIni.isEmpty() ? "(kosong)" : teksSaatIni);
        System.out.println(" ");
    }

    public static void main(String[] args) {
        // Inisialisasi editor tanpa input dari Scanner
        TextEditor editor = new TextEditor();

        // Operasi tulis langsung ke dalam kode
        editor.tulis("Hai! Noval Adiya Putra");
        editor.tampilkan();

        editor.tulis(" Selamat datang.");
        editor.tampilkan();

        // Operasi undo
        editor.undo();
        editor.tampilkan();

        // Operasi redo
        editor.redo();
        editor.tampilkan();
    }
}
