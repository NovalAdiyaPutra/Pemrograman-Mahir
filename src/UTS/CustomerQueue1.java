package UTS;
import java.util.PriorityQueue;
import java.util.Comparator;

class Customer {
    String name;
    int priority;

    public Customer(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return name + "(Priority: " + priority + ")";
    }
}

public class CustomerQueue1 {
    private PriorityQueue<Customer> queue;

    public CustomerQueue1() {
        queue = new PriorityQueue<>(Comparator.comparingInt(c -> c.priority));
    }

    public void addCustomer(String name, int priority) {
        queue.add(new Customer(name, priority));
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
        CustomerQueue1 customerQueue = new CustomerQueue1();
        customerQueue.addCustomer("Customer A", 2);
        customerQueue.addCustomer("Customer B", 1);
        customerQueue.addCustomer("Customer C", 3);

        customerQueue.displayQueue(); // Output: Current queue: [Customer B, Customer A, Customer C]
        customerQueue.serveCustomer(); // Output: Serving: Customer B (priority 1)
        customerQueue.displayQueue(); // Output: Current queue: [Customer A, Customer C]
    }
}
