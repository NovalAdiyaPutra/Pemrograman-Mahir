package BinaryTree;

public class NodeBt {
    private int data;
    private NodeBt left,right;

    public NodeBt(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public NodeBt getLeft() {
        return left;
    }

    public NodeBt getRight() {
        return right;
    }

    public void insert(int value){
        if (value == this.data){
            System.out.println("Tidak boleh insert nilai yang sama");
        } else if (value < this.data){
            if (this.left != null){
                this.left.insert(value);
            } else {
                this.left = new NodeBt(value);
            }
        } else {
            if (this.right != null){
                this.right.insert(value);
            } else {
                this.right = new NodeBt(value);
            }
        }
    }

    public int degree(){
        int l = this.left != null ? 1 : 0;
        int r = this.right != null ? 1 : 0;
        return l + r;
    }

    public int height(){
        int leftHeight = this.left != null ? 1 + this.left.height() : 0;
        int rightHeight = this.right != null ? 1 + this.right.height() : 0;
        return Math.max(leftHeight,rightHeight);
    }

    public NodeBt search (int value){
        if (value == data) {
            return this;
        } else if (value < this.data){
            if (this.left != null){
                return this.left.search(value);
            } else {
                return null;
            }
        } else {
            if (this.right != null){
                return this.right.search(value);
            } else {
                return null;
            }
        }
    }

    public int depth (int value, int base){
        if (value == this.data) {
            return base;
        } else if (value < this.data){
            if (this.left != null){
                return this.left.depth(value, base + 1);
            } else {
                return -1;
            }
        } else {
            if (right != null){
                return this.right.depth(value, base + 1);
            } else {
                return -1;
            }
        }
    }

    public String path (int value, String base){
        if (value == this.data){
            return base + this.data;
        } else if (value < this.data){
            if (this.left != null){
                return this.left.path(value, base + this.data + " - ");
            } else {
                return "tidak ditemukan";
            }
        } else {
            if (this.right != null){
                return this.right.path(value, base + this.data + " - ");
            } else {
                return "tidak ditemukan";
            }
        }
    }

    public NodeBt findMin(){
        if (this.left != null){
            return this.left.findMin();
        } else {
            return this;
        }
    }

    public NodeBt findMax(){
        if (this.left != null){
            return this.left.findMax();
        } else {
            return this;
        }
    }
}
