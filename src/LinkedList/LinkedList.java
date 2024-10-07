package LinkedList;

public class LinkedList {
    public List head;

    public void insertFront(int value) {
        List baru = new List(value);
        baru.next = head;
        head = baru;
    }

    public int removeFront(){
        if(head != null){
            List temp = head;
            head = head.next;
            return temp.data;
        }
        return -1;
    }

    public void insertBack(int value) {
        List current = head;
        if(current == null){
            List baru = new List(value);
            current = baru;
        } else {
            while(current.next != null){
                current = current.next;
            }
            List baru = new List(value);
            current.next = baru;
        }
    }

    public int removeBack(){
        if(head != null){
            List current = head;
            if (current.next == null){
                List temp = current;
                head = null;
                return temp.data;
            } else {
                while(current.next.next != null){
                    current = current.next;
                }
                List temp = current.next;
                current.next = null;
                return temp.data;
            }
        }
        return -1;
    }

    public void insertIn(int n, int value){
        if(head == null && n == 0){
            List baru = new List(value);
            head = baru;
        } else {
            List current = head;
            int i = 0;
            while (current.next != null && i < n-1){
                current = current.next;
                i++;
            }
            if (current.next != null){
                List baru = new List(value);
                baru.next = current.next;
                current.next = baru;
            }
        }
    }

    public int removeIn(int n){
        if(head != null){
            if (n == 0){
                List temp = head;
                head = head.next;
                return temp.data;
            } else {
                List current = head;
                int i = 0;
                while (current.next != null && 1 < n-1){
                    current = current.next;
                    i++;
                }
                if (current.next != null){
                    List temp = current.next;
                    current.next = current.next.next;
                    return temp.data;
                }
            }
        }
        return -2;
    }
}
