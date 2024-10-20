package TugasTextEditor;
import java.util.Stack;

public class TextEditor {
    private Stack<String> undoStack;
    private Stack<String> redoStack;
    private String teksSaatIni;

    public TextEditor() {
        undoStack = new Stack<>();
        redoStack = new Stack<>();
        teksSaatIni = "";
    }

    public void write(String teksBaru) {
        undoStack.push(teksSaatIni);
        teksSaatIni += teksBaru;
        redoStack.clear();
        System.out.println("Teks ditambahkan: " + teksBaru);
    }

    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Tidak ada yang bisa di-undo.");
        } else {
            redoStack.push(teksSaatIni);
            teksSaatIni = undoStack.pop();
            System.out.println("Undo dilakukan.");
        }
    }

    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Tidak ada yang bisa di-redo.");
        } else {
            undoStack.push(teksSaatIni);
            teksSaatIni = redoStack.pop();
            System.out.println("Redo dilakukan.");
        }
    }

    public void show() {
        System.out.print("Teks Saat Ini: ");
        System.out.println(teksSaatIni.isEmpty() ? "(kosong)" : teksSaatIni);
        System.out.println(" ");
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.write("Hai! Noval Adiya Putra");
        editor.show();

        editor.write(" . Selamat datang.");
        editor.show();

        editor.undo();
        editor.show();

        editor.redo();
        editor.show();
    }
}
