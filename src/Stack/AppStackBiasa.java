package Stack;

public class AppStackBiasa {
    public static void main(String[] args) {
        StackBiasa stack = new StackBiasa(3);

        stack.push(6);
        stack.push(2);
        stack.push(8);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}