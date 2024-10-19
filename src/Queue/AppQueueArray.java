package Queue;
import java.util.Scanner;

public class AppQueueArray {
    public static void main(String[] args) {
        QueueArray queue = new QueueArray(9);

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
