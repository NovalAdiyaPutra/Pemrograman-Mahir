package Stack;

public class StackBiasa {
    public int[] data;
    public int top = 0; //menyimpan indeks paling atas

    public StackBiasa(int n) {
        data = new int[n];
    }

    public void push(int value) {
        data[top] = value;
        top = top + 1;
    }

    public int pop() {
        top = top - 1;
        int r = data[top];
        return r;
    }
}