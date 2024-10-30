package AVLTree;

public class NodeAvl {
    private int data;
    private NodeAvl left, right;

    public NodeAvl(int data) {
        this.data = data;
    }

    public NodeAvl insert(int value) {
        if (value == this.data) {
            System.out.println("Data tidak boleh duplikat");
        } else if (value < this.data) {
            this.leftInsert(value);
        } else {
            this.rightInsert(value);
        }
        // auto balance
        NodeAvl balanced = balance(this);
        return balanced;
    }

    public void leftInsert(int value) {
        if (this.left != null) {
            this.left = this.left.insert(value);
        } else {
            this.left = new NodeAvl(value);
        }
    }

    public void rightInsert(int value) {
        if (this.right != null) {
            this.right = this.right.insert(value);
        } else {
            this.right = new NodeAvl(value);
        }
    }

    public int degree() {
        int l = this.left != null ? 1 : 0;
        int r = this.right != null ? 1 : 0;
        return l + r;
    }

    public int height() {
        return Math.max(this.leftHeight(), this.rightHeight());
    }

    public int leftHeight() {
        return this.left != null ? 1 + this.left.height() : 0;
    }

    public int rightHeight() {
        return this.right != null ? 1 + this.right.height() : 0;
    }

    public NodeAvl search(int value) {
        if (this.data == value) {
            return this;
        } else if (value < this.data) {
            return this.leftSearch(value);
        } else {
            return this.rightSearch(value);
        }
    }

    public NodeAvl leftSearch(int value) {
        if (this.left != null) {
            return this.left.search(value);
        } else {
            return null;
        }
    }

    public NodeAvl rightSearch(int value) {
        if (this.right != null) {
            return this.right.search(value);
        } else {
            return null;
        }
    }

    public int depth(int value, int base) {
        if (value == this.data) {
            return base;
        } else if (value < this.data) {
            return this.leftDepth(value, base);
        } else {
            return this.rightDepth(value, base);
        }
    }

    public int leftDepth(int value, int base) {
        if (this.left != null) {
            return this.left.depth(value, base + 1);
        } else {
            return -1;
        }
    }

    public int rightDepth(int value, int base) {
        if (this.right != null) {
            return this.right.depth(value, base + 1);
        } else {
            return -1;
        }
    }

    public String path(int value, String path) {
        if (value == this.data) {
            return path + data;
        } else if (value < this.data) {
            return this.leftPath(value, path);
        } else {
            return this.rightPath(value, path);
        }
    }

    public String leftPath(int value, String path) {
        if (this.left != null) {
            return this.left.path(value, path + this.data + " - ");
        } else {
            return "tidak ditemukan";
        }
    }

    public String rightPath(int value, String path) {
        if (this.right != null) {
            return this.right.path(value, path + this.data + " - ");
        } else {
            return "tidak ditemukan";
        }
    }

    public NodeAvl findMin() {
        if (this.left != null) {
            return this.left.findMin();
        } else {
            return this;
        }
    }

    public NodeAvl findMax() {
        if (this.right != null) {
            return this.right.findMax();
        } else {
            return this;
        }
    }

    public void printPreOrder() {
        System.out.println(this.data);
        if (this.left != null) {
            this.left.printPreOrder();
        }
        if (this.right != null) {
            this.right.printPreOrder();
        }
    }

    public void printInOrder() {
        if (this.left != null) {
            this.left.printInOrder();
        }
        System.out.println(this.data);
        if (this.right != null) {
            this.right.printInOrder();
        }

    }

    public void printPostOrder() {
        if (this.left != null) {
            this.left.printPostOrder();
        }
        if (this.right != null) {
            this.right.printPostOrder();
        }
        System.out.println(this.data);
    }

    public NodeAvl remove(int value) {
        if (value == this.data) {
            if (this.left != null && this.right != null) {
                NodeAvl successor = this.right.findMin();
                NodeAvl current = this.remove(successor.data);
                successor.left = current.left;
                successor.right = balance(current.right);
                return successor;
            } else if (this.left != null) {
                return balance(this.left);
            } else if (this.right != null) {
                return balance(this.right);
            } else {
                return null;
            }
        } else if (value < this.data) {
            return this.leftRemove(value);
        } else {
            return this.rightRemove(value);
        }
    }

    private NodeAvl leftRemove(int value) {
        if (this.left != null) {
            this.left = this.left.remove(value);
            return balance(this);
        } else {
            return null;
        }
    }

    private NodeAvl rightRemove(int value) {
        if (this.right != null) {
            this.right = this.right.remove(value);
            return balance(this);
        } else {
            return null;
        }
    }

    public static NodeAvl balance(NodeAvl current) {
        int balanceFactor = current.leftHeight() - current.rightHeight();
        if (balanceFactor < -1){
            // left rotation
            int balanceFactorOnright = current.right.leftHeight() - current.right.rightHeight();
            if (balanceFactorOnright > 0){
                //double rotation
            }
            current = leftRotation(current);
        } else if (balanceFactor > 1){
            //right rotation
            int balanceFactorOnleft = current.left.leftHeight() - current.left.rightHeight();
            if (balanceFactorOnleft < 0){
                //double rotation
            }
            current = rightRotation(current);
        }
        return current;
    }

    private static NodeAvl leftRotation(NodeAvl current){
        NodeAvl temp = current.right.left;
        current.right.left = current;
        current = current.right;
        current.left.right = temp;
        return current;
    }

    private static NodeAvl rightRotation(NodeAvl current){
        NodeAvl temp = current.left.right;
        current.left.right = current;
        current = current.left;
        current.right.left = temp;
        return current;
    }

}