package Array;

public class DeklarasiArray {
    public static void main(String[] args) {
        String[] nama = new String[5]; //Java style
        String panggilan[] = new String[5]; //C Style

        nama[0] = "Noval";
        nama[1] = "Adiya";
        nama[2] = "Putra";

        for (int i = 0; i < nama.length; i++) {
            System.out.println("Nama ke " + i +" = " + nama[i]);
        }
    }
}
