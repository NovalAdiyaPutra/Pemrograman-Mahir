package Queue;
import java.util.Scanner;

public class AppGenericQueue {
    public static void main(String[] args) {
        GenericQueue<Integer> queue = new GenericQueue<>(9);

        String input = "1 2 3 4 5 6 7 8 9";
        Scanner sc = new Scanner(input);

        for(int i = 0; i < 9; i++) {
            queue.enqueue(sc.nextInt());
        }

        for (int i = 0; i < 9; i++) {
            System.out.print(queue.dequeue() + " ");
        }
    }
}
