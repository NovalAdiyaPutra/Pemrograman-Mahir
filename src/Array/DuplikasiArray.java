package Array;

public class DuplikasiArray {
    public static void main(String[] args) {
        int [] nilai = {89,32,53,64,75,86,17,68,90,100};
        int [] angka = nilai;
        // nilai [0] = 100 untuk mengubah nilai

        for (int i = 0; i < angka.length; i++) {
            System.out.println("Angka " + i + " = " + angka[i]);
        }
    }
}
