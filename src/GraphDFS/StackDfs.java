package GraphDFS;

public class StackDfs {
    private int[] data;
    private int top;

    public StackDfs(int n) {
        this.data = new int[n];
        this.top = 0;
    }

    public boolean isEmpty(){
        return this.top == 0;
    }

    public boolean isFull(){
        return this.top == this.data.length;
    }

    public void push(int value) {
        if (!this.isFull()) {
            this.data[this.top++] = value;
        } else {
            System.out.println("stack sudah penuh");
        }
    }

    public int pop() {
        if (!this.isEmpty()) {
            return this.data[--this.top];
        } else {
            System.out.println("stack sudah penuh");
        } return -1;
    }
}
