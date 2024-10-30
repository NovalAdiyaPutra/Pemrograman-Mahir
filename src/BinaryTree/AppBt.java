package BinaryTree;

public class AppBt {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.insert(56);
        bt.insert(67);
        bt.insert(78);
        bt.insert(45);
        //bt.insert(56);
        //bt.insert(45);
        //bt.insert(9);
        //bt.insert(78);
        //bt.insert(90);
        //bt.insert(67);
        //bt.insert(70);


        System.out.println("Degree root = " +bt.degree()); //anakan
        System.out.println("Degree root.left = " +bt.getRoot().getLeft().degree());
        System.out.println("Degree root.right = " +bt.getRoot().getRight().degree());

        System.out.println("Height root = " +bt.height()); //mulai dari atas kebawah
        System.out.println("Height root.left = " +bt.getRoot().getLeft().height());
        System.out.println("Height root.right = " +bt.getRoot().getRight().height());

        System.out.println("Search 45 = " +bt.search(45));
        System.out.println("Height 67 = " +bt.search(67).height());
        System.out.println("Data 67.right = "+bt.search(67).getRight().getData());

        System.out.println("Deepth root = " +bt.depth(56)); //level mulai dari 0 dari bawah keatas
        System.out.println("Deepth 45 = " +bt.depth(45));
        System.out.println("Height 45 = " +bt.getRoot().getLeft().height());

        System.out.println("Path 78 = " +bt.path(78));

        System.out.println("Min = " +bt.findMin().getData());
        System.out.println("Max = " +bt.findMax().getData());

        bt.printInOrder();
        System.out.println();

        bt.printPostOrder();
        System.out.println();

        bt.printPreOrder();
        System.out.println();

        bt.remove(78);
        System.out.println();

        bt.printInOrder();
    }
}
