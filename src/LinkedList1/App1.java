package LinkedList1;

public class App1 {
    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1();

        ll.insertBack(9);
        ll.insertBack(6);
        ll.insertBack(7);
        ll.insertBack(5);

        System.out.println(ll.removeFront());

        System.out.println("T");
    }
}