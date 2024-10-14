package LinkedList1;

public class LinkedList1 {
    public ListInt head;
    public ListInt tail;

    public void insertFront(int value) {
        ListInt baru = new ListInt(value);
        baru.right = head;
        if (head == null) {
            head.left = baru;
        }
        head = baru;
        if (tail == null) {
            tail = baru;
        }
    }

    public void insertBack(int value) {
        ListInt baru = new ListInt(value);
        baru.left = tail;
        if (tail == null) {
            tail.right = baru;
        }
        tail = baru;
        if (head == null) {
            head = baru;
        }
    }

    public int removeFront(){
        if (head != null) {
            ListInt temp = head;
            head = head.right;
            if (head != null) {
                head.left = null;
            } else {
                tail = null;
            }
            return temp.data;
        }
        return -1;
    }

    public int removeBack(){
        if (tail != null) {
            ListInt temp = tail;
            tail = tail.left;
            if (tail != null) {
                tail.right = null;
            } else {
                head = null;
            }
            return temp.data;
        }
        return -1;
    }
}
