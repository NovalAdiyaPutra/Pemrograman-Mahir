package Tree;

public class Tree {
    private Node root;

    public Tree() {

    }

    public void add(int value){
        if (this.root != null){
            this.root.add(value);
        } else {
            this.root = new Node(value);
        }
    }

    public void delete(int indeks){
        this.root.delete(indeks);
    }
}
