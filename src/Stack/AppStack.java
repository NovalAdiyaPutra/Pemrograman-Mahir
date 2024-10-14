package Stack;

public class AppStack {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(6);
        stack.push(2);
        stack.push(8);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}