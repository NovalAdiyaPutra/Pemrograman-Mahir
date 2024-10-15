package Stack;

import java.util.Scanner;

public class AppBalancedSymbol {
    public static void main(String[] args) {
        StackGeneric<String> stack = new StackGeneric<>(20);
        String input = "f(x)=3x+((2x+12)-14)";
        Scanner sc = new Scanner(input);

        sc.useDelimiter("");
        for (int i = 0; i < 20; i++) {
            String karakter = sc.next();
            if (karakter.equals("(")){
                stack.push("(");
            } else if (karakter.equals(")")){
                stack.pop();
            }
        }

        if (stack.isEmpty()){
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
