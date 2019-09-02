public class BSTDriver {
    public static void main(String[] args) {
        BST tree = new BST();

        tree.printInOrder();

        int[] arr = {10, 30, 40, 50, 20, 80, 60, 70, 90, 100};
        for (int i=0; i< arr.length; i++)
            tree.insert(arr[i]);

        System.out.println(tree.search(45));
        System.out.println(tree.search(70));

        tree.printInOrder();
        tree.printPreOrder();
        tree.printPostOrder();

        tree.printLevelOrder();

        System.out.println(tree.getHeight());


        tree.delete(50);
        tree.printInOrder();

        tree.delete(90);
        tree.printInOrder();

        tree.delete(45);
        tree.printInOrder();
    }
}