public class ContohStatic {
        // Variabel static di tingkat kelas
        static int counter = 0;

        public void tambahCounter() {
            //Tidak bisa membuat variabel static di sini
            //static int temp = 0; // Ini akan menyebabkan error

            counter++;
        }

        public static void main(String[] args) {
            ContohStatic contoh = new ContohStatic();
            contoh.tambahCounter();
            System.out.println("Counter: " + counter); // Output: Counter: 1
        }

}
