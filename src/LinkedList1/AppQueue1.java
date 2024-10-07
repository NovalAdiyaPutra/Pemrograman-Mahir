package LinkedList1;

public class AppQueue1 {
    public static void main(String[] args) {
        Queue1 queue1 = new Queue1();

        queue1.enqueue(1);
        queue1.enqueue(2);
        queue1.enqueue(3);
        queue1.enqueue(4);

        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
    }
}
