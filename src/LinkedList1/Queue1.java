package LinkedList1;

public class Queue1 {
    public LinkedList1 queque;
    public Queue1(){
        queque = new LinkedList1();
    }

    public void enqueue(int value){
        queque.insertBack(value);
    }

    public int dequeue(){
        return queque.removeFront();
    }
}
