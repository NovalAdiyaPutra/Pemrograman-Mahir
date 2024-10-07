package LinkedList;

public class List {
    public int data;            //deklarasi linked list
    public List next;

    public List(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public List getNext() {
        return next;
    }

    public void setNext(List next) {
        this.next = next;
    }
}
