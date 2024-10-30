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
        if (this.right != null){
            return this.right.findMax();
        } else {
            return this;
        }
    }

    public void printInOrder(){
        if(this.left != null){
            this.left.printInOrder();
        }
        System.out.println(this.data);
        if (this.right != null){
            this.right.printInOrder();
        }
    }

    public void printPostOrder(){
        if (this.left != null){
            this.left.printPostOrder();
        }
        if (this.right != null){
            this.right.printPostOrder();
        }
        System.out.println(this.data);
    }

    public void printPreOrder(){
        System.out.println(this.data);
        if (this.left != null){
            this.left.printPreOrder();
        }
        if (this.right != null){
            this.right.printPreOrder();
        }
    }

    public NodeBt remove(int value){
        if(value == this.data){
            if (this.left != null && this.right != null){
                //ada left ada right
                NodeBt successor = this.right.findMin();
                NodeBt current = this.remove(successor.data);
                successor.left = current.left;
                successor.right = current.right;
                return successor;
            } else if (this.left != null){
                //ada left
                return this.left;
            } else if (this.right != null){
                //ada right
                return this.right;
            } else {
                //leaf
                return null;
            }

        } else if (value < this.data){
            //cek kekiri
            if (this.left != null){
                this.left = this.left.remove(value);
                return this;
            } else {
                return null;
            }
        } else {
            if (this.right != null){
                this.right = this.right.remove(value);
                return this;
            } else {
                return this;
            }
        }
    }
}
