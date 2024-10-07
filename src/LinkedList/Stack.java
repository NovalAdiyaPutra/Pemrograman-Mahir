package LinkedList;
    public class Stack {
        public LinkedList data;

        public Stack() {
            data = new LinkedList();
        }
        public void push (int value){
            data.insertFront(value);
        }

        public int pop(){
            return data.removeFront();
        }
    }