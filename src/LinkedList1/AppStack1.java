package LinkedList1;

public class AppStack1 {
    public static void main(String[] args) {
        Stack1 stack = new Stack1();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
