package Tree;

public class Node {
    private int data;
    private Node [] children;
    private int jumlah;
    private int maksimal;

    public Node(int data) {
        this.data = data;
        this.jumlah = 0;
        this.maksimal = 5;
        this.children = new Node[5];
    }

    public void add(int value){
        if (this.jumlah < this.maksimal){
            this.children[jumlah] = new Node(value);
            jumlah++;
        }
    }

    public void delete(int indeks){
        if (indeks >= 0 && indeks < this.maksimal){
            this.children[indeks] = null;
        }
    }
    public int degree(){
        return this.jumlah;
    }
}
