package BinaryTree;

public class BinaryTree {
    private NodeBt root;

    public BinaryTree() {
    }

    public NodeBt getRoot() {
        return root;
    }

    public void insert(int value){
        if(this.root != null){
            this.root.insert(value);
        }else{
            this.root = new NodeBt(value);
        }
    }

    public int degree(){
        if(this.root != null){
            return this.root.degree();
        } else {
            return -1;
        }
    }

    public int height(){
        if(this.root != null){
            return this.root.height();
        } else {
            return -1;
        }
    }

    public NodeBt search(int value){
        if(this.root != null){
            return this.root.search(value);
        } else {
            return null;
        }
    }

    public int depth(int value){
        if(this.root != null){
            return -1;
        } else {
            return this.root.depth(value,0);
        }
    }

    public String path(int value){
        if(this.root != null){
            return "tree kosong";
        } else {
            return root.path(value, "");
        }
    }

    public NodeBt findMin(){
        if(this.root != null){
            return this.root.findMin();
        } else {
            return null;
        }
    }

    public NodeBt findMax(){
        if(this.root != null){
            return this.root.findMax();
        } else {
            return null;
        }
    }
}
