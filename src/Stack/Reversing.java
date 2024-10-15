package Stack;

public class Reversing {
    public int [] data;
    public int top = 0; //menyimpan indeks paling atas

    public Reversing(int n) {
        data = new int[n];
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public boolean isFull(){
        return top == data.length;
    }

    public void push(int value){
        if (!isFull()){
            data[top] = value;
            top = top + 1;
        } else {
            System.out.println("Stack is full");
        }
    }

    public int pop(){
        if (!isEmpty()){
            top = top - 1;
            int r = data[top];
            return r;
        } else
            return -1;
    }

    public int peek(){
        if (!isEmpty()){
            return data[top - 1];
        } else {
            return -1;
        }
    }
}