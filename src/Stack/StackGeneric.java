package Stack;

public class StackGeneric<T> {
    public T[] data;
    public int top = 0; //menyimpan indeks paling atas

    public StackGeneric(int n) {
        data =(T[]) new Object[n];
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public boolean isFull(){
        return top == data.length;
    }

    public void push(T value){
        if (!isFull()){
            data[top] = value;
            top = top + 1;
        } else {
            System.out.println("Stack is full");
        }
    }

    public T pop(){
        if (!isEmpty()){
            top = top - 1;
            T r = data[top];
            return r;
        } else
            return null;
    }

    public T peek(){
        if (!isEmpty()){
            return data[top - 1];
        } else {
            return null;
        }
    }
}
