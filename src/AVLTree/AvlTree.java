package AVLTree;

public class AvlTree {
    private NodeAvl root;

    public void insert(int value) {
        if(this.root != null){
            this.root = this.root.insert(value);
        } else {
            this.root = new NodeAvl(value);
        }
    }

    public int degree() {
        if(this.root != null){
            return this.root.degree();
        } else {
            return -1;
        }
    }

    public int height() {
        if(this.root != null){
            return this.root.height();
        } else {
            return -1;
        }
    }

    public NodeAvl search(int value) {
        if(this.root != null){
            return this.root.search(value);
        } else {
            return null;
        }
    }

    public int depth(int value, int base) {
        if(this.root != null){
            return this.root.depth(value,0);
        } else {
            return -1;
        }
    }

    public String path(int value, String path) {
        if(this.root != null){
            return this.root.path(value,"");
        } else {
            return "tidak ditemukan";
        }
    }

    public NodeAvl findMin() {
        if(this.root != null){
            return this.root.findMin();
        } else {
            return null;
        }
    }

    public NodeAvl findMax() {
        if(this.root != null){
            return this.root.findMax();
        } else {
            return null;
        }
    }

    public void printPreOrder() {
        if(this.root != null){
            this.root.printPreOrder();
        } else {
            System.out.println("Tree masih kosong");;
        }
    }

    public void printInOrder() {
        if(this.root != null){
            this.root.printInOrder();
        } else {
            System.out.println("Tree masih kosong");;
        }
    }

    public void printPostOrder() {
        if(this.root != null){
            this.root.printPostOrder();
        } else {
            System.out.println("Tree masih kosong");;
        }
    }

    public void remove(int value) {
        if(this.root != null){
            this.root = this.root.remove(value);
        } else {
            System.out.println("Tree masih kosong");
        }
    }
}
