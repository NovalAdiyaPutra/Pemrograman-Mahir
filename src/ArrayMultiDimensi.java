public class ArrayMultiDimensi {
    public static void main(String[] args) {

        int [] [] nilai = new int[4][5];

        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(nilai[i][j]);
            }
            System.out.println();
        }
    }
}
