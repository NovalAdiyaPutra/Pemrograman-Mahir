package Tree;

public class AppTree {
    public static void main(String[] args) {

        Tree tree = new Tree();

        tree.add(8);
        tree.add(2);
        tree.add(7);
        tree.add(9);

        tree.delete(2); //delete 9

    }
}
