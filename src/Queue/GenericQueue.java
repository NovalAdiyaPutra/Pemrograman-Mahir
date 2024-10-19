package Queue;

public class GenericQueue<T> {
    public T[] data;
    public int tail;

    public GenericQueue(int n){
        data = (T[]) new Object[n];
        tail = 0;
    }

    public void enqueue(T value){
        if(tail < data.length){
            data[tail] = value;
            tail++;
        }
    }

    public T dequeue(){
        if (tail > 0){
            T r = data[0];
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
