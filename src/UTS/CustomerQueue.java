package UTS;
import java.util.LinkedList;
import java.util.Queue;

public class CustomerQueue {
    private Queue<String> queue;

    public CustomerQueue() {
        queue = new LinkedList<>();
    }

    public void addCustomer(String customer) {
        queue.add(customer);
    }

    public void serveCustomer() {
        if (!queue.isEmpty()) {
            System.out.println("Serving: " + queue.poll());
        } else {
            System.out.println("No customers in queue");
        }
    }

    public void displayQueue() {
        System.out.println("Current queue: " + queue);
    }

    public static void main(String[] args) {
        CustomerQueue customerQueue = new CustomerQueue();
        customerQueue.addCustomer("Customer A");
        customerQueue.addCustomer("Customer B");
        customerQueue.addCustomer("Customer C");

        customerQueue.displayQueue(); // Output: Current queue: [Customer A, Customer B, Customer C]
        customerQueue.serveCustomer(); // Output: Serving: Customer A
        customerQueue.displayQueue(); // Output: Current queue: [Customer B, Customer C]
    }
}