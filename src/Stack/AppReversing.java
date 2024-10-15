package Stack;

import java.util.Scanner;
public class AppReversing {
    public static void main(String[] args) {

        Reversing stack = new Reversing(9);
        String input = "1 2 3 4 5 6 7 8 9";
        Scanner sc = new Scanner(input);

        for (int i = 0; i < 9; i++) {
            stack.push(sc.nextInt());
        }

        for (int i = 0; i < 9; i++) {
            System.out.print(stack.pop() +" ");
        }
    }
}
