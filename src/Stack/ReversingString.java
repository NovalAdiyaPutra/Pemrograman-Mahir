package Stack;

public class ReversingString {
    public String [] data;
    public int top = 0;

    public ReversingString(int n) {
        data = new String[n];
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public boolean isFull(){
        return top == data.length;
    }

    public void push(String value){
        if (!isFull()){
            data[top] = value;
            top = top + 1;
        } else {
            System.out.println("Stack is full");
        }
    }

    public String pop(){
        if (!isEmpty()){
            top = top - 1;
            String r = data[top];
            return r;
        } else
            return null;
    }

    public String peek(){
        if (!isEmpty()){
            return data[top - 1];
        } else {
            return null;
        }
    }
}
