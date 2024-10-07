package LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList lst = new LinkedList();
        lst.insertFront(7);
        lst.insertFront(8);
        lst.insertBack(9);
        lst.insertIn(2,5);

        lst.removeIn(2);
        lst.removeBack();
        lst.removeFront();

        System.out.println(lst.removeFront());
        System.out.println(lst.removeBack());
        System.out.println(lst.head.data);

        System.out.println(lst.head == null);
    }
}
