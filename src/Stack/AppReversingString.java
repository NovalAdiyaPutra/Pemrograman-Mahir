package Stack;
import java.util.Scanner;

public class AppReversingString {
    public static void main(String[] args) {

        ReversingString stack = new ReversingString(4);
        String input = "Saya Belajar Struktur Data";
        Scanner sc = new Scanner(input);

        for (int i = 0; i < 4; i++) {
            stack.push(sc.next());
        }

        for (int i = 0; i < 4; i++) {
            System.out.print(stack.pop() +" ");
        }
    }
}
