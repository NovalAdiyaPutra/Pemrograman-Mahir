package Queue;

public class QueueArray {
    public int[] data;
    public int tail;

    public QueueArray(int n){
        data = new int[n];
        tail = 0;
    }

    public void enqueue(int value){
        if(tail < data.length){
            data[tail] = value;
            tail++;
        }
    }

    public int dequeue(){
        if(tail > 0){
            int r = data[0];
            for(int i = 1; i < data.length; i++){
                data[i-1] = data[i];
            }
            tail--;
            return r;
        } else {
            return -1;
        }
    }
}