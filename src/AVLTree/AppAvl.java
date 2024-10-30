package AVLTree;

public class AppAvl {
    public static void main(String[] args) {
        AvlTree tree = new AvlTree();

        tree.insert(56);
        tree.insert(67);
        tree.insert(78);
        tree.insert(85);
        tree.insert(90);

        tree.remove(56);

    }
}
