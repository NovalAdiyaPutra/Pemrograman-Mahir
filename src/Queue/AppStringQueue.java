package Queue;

import java.util.Scanner;

public class AppStringQueue {
    public static void main(String[] args) {
        String input = "saya belajar struktur data";
        Scanner sc = new Scanner(input);

        int n = 4;

        StringQueue queue = new StringQueue(n);

        for (int i = 0; i < n; i++) {
            queue.enqueue(toCaps(sc.next()));
        }

        for (int i = 0; i < n; i++) {
            System.out.print(queue.dequeue() +" ");
        }
    }
     public static String toCaps(String teks){
        return teks.substring(0,1).toUpperCase() + teks.substring(1,teks.length());
     }
}
