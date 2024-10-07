package Array;

public class ArrayString {
    public static void main(String[] args) {
        String[] array = {"Andi","Budi","Citra"};

        array[0] = "Alex";

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
