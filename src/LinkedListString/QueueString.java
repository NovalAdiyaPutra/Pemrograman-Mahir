package LinkedListString;
public class QueueString {

    public LinkedListString queque;

    public QueueString(){
        queque = new LinkedListString();
    }

    public void enqueue(String value){
        queque.insertBack(value);
    }

    public String dequeue(){
        return queque.removeFront();
    }
}