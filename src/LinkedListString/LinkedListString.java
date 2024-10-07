package LinkedListString;

public class LinkedListString {
    public ListString head;
    public ListString tail;

    public void insertFront(String value) {
        ListString baru = new ListString(value);
        baru.right = head;
        if (head == null) {
            head.left = baru;
        }
        head = baru;
        if (tail == null) {
            tail = baru;
        }
    }

    public void insertBack(String value) {
        ListString baru = new ListString(value);
        baru.left = tail;
        if (tail == null) {
            tail.right = baru;
        }
        tail = baru;
        if (head == null) {
            head = baru;
        }
    }

    public String removeFront(){
        if (head != null) {
            ListString temp = head;
            head = head.right;
            if (head != null) {
                head.left = null;
            } else {
                tail = null;
            }
            return temp.data;
        }
        return null;
    }

    public String removeBack(){
        if (tail != null) {
            ListString temp = tail;
            tail = tail.left;
            if (tail != null) {
                tail.right = null;
            } else {
                head = null;
            }
            return temp.data;
        }
        return null;
    }
}
