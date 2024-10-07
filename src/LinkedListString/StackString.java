package LinkedListString;
public class StackString {
    public LinkedListString stack;
    public StackString(){
        stack = new LinkedListString();
    }

    public void push(String value){
        stack.insertBack(value);
    }

    public String pop(){
        return stack.removeBack();
    }
}
