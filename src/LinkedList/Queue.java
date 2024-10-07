package LinkedList;

public class Queue {
    public LinkedList data;

    public Queue() {
        data = new LinkedList();
    }
    public void enqueue (int value){
        data.insertFront(value);
    }

    public int dequeue(){
        return data.removeBack();
    }
}
