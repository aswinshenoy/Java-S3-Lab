import java.util.ArrayDeque;

class BST{
    BSTNode root;

    public void insert(int d) {
        if(root == null)
            root = new BSTNode(d);
        else
            root.insert(d);
    }

    public boolean search(int d) {
        if(root.data == d)
            return true;
        else
            return root.search(d);
    }

    public void delete(int d) {
        if(root == null)
            return;
        else if(root.data == d) {
            BSTNode dummy = new BSTNode();
            dummy.left = root;
            root = dummy;
            root.delete(d);
            root = root.left;
        }
        else
            root.delete(d);
    }

    public void printInOrder() {
        if (root != null) root.inorder();
        System.out.print("\n");
    }

    public void printPreOrder() {
        if (root != null) root.preorder();
        System.out.print("\n");
    }

    public void printPostOrder() {
        if (root != null) root.postorder();
        System.out.print("\n");
    }

    public int getHeight() {
        if(root != null) return root.height();
        else return 0;
    }

    public void printLevelOrder() {
        ArrayDeque<BSTNode> q = new ArrayDeque<BSTNode>();
        q.addLast(root);

        while(!q.isEmpty())
        {
            BSTNode n = q.removeFirst();
            System.out.print(n.data + " ");

            if(n.left != null)
                q.addLast(n.left);
            if(n.right != null)
                q.addLast(n.right);
        }
        System.out.println();

    }
}