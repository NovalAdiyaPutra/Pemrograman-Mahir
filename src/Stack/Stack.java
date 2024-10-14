package Stack;

public class Stack {
    public int [] data;
    public int top = 0;             //menyimpan indeks paling atas

    public Stack(int n) {
        data = new int[n];
    }

    public void push(int value){
        data[top] = value;
        top = top + 1;
    }

    public int pop(){
        if (top > 0){
            top = top - 1;
            int r = data[top];
            return r;
        } else
            return 0;
    }
}