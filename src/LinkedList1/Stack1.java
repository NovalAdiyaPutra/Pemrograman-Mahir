package LinkedList1;

public class Stack1 {
    public LinkedList1 stack;
    public Stack1(){
        stack = new LinkedList1();
    }

    public void push(int value){
        stack.insertBack(value);
    }

    public int pop(){
        return stack.removeBack();
    }
}
