package LinkedList;

public class AppStack {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //LinkedList lst = new LinkedList();
        //lst.insertFront(7);
        //lst.insertFront(8);
        //lst.insertBack(9);
        //lst.insertIn(2,5);

        //lst.removeIn(2);
        //lst.removeBack();
        //lst.removeFront();

        //System.out.println(lst.removeFront());
        //System.out.println(lst.removeBack());
        //System.out.println(lst.head.data);

        //System.out.println(lst.head == null);
    }
}