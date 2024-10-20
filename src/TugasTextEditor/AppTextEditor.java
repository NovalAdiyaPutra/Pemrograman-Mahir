package TugasTextEditor;

public class AppTextEditor {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.write("Hai! Noval Adiya Putra.");
        editor.show();

        editor.write(" Selamat datang.");
        editor.show();

        editor.undo();
        editor.show();

        editor.redo();
        editor.show();
    }
}
