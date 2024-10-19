package Queue;

public class StringQueue {
    public String[] data;
    public int tail;

    public StringQueue(int n){
        data = new String[n];
        tail = 0;
    }

    public void enqueue(String value){
        if(tail < data.length){
            data[tail] = value;
            tail++;
        }
    }

    public String dequeue(){
        if (tail > 0){
            String r = data[0];
            for(int i = 1; i < data.length; i++){
                data[i-1] = data[i];
            }
            tail--;
            return r;
        } else {
            return null;
        }
    }
}
