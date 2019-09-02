class BSTNode{
    int data;
    BSTNode left;
    BSTNode right;

    BSTNode() {}

    BSTNode(int d) { data = d; }

    public static int max(int a, int b) {
        if(a>b) return a;
        else return b;
    }

    public boolean isLeaf() {
        if(left == null & right == null)
            return true;
        return false;
    }

    public boolean hasOnlyLeft() {
        if(left != null & right == null)
            return true;
        return false;
    }

    public boolean hasOnlyRight() {
        if(left == null & right != null)
            return true;
        return false;
    }

    public void insert(int d) {
        if(d < data)
        {
            if(left == null)
                left =  new BSTNode(d);
            else
                left.insert(d);
        }
        else
        {
            if(right == null)
                right = new BSTNode(d);
            else
                right.insert(d);
        }
    }

    public boolean search(int d) {
        if(d == data)
            return true;
        else if(d < data && left != null)
            return left.search(d);
        else if(right != null)
            return right.search(d);
        else
            return false;
    }

    public void inorder() {
        if(left != null)
            left.inorder();

        System.out.print(data + " ");

        if(right != null)
            right.inorder();
    }

    public void preorder() {
        System.out.print(data + " ");

        if(left != null)
            left.preorder();

        if(right != null)
            right.preorder();
    }

    public void postorder() {
        if(left != null)
            left.postorder();

        if(right != null)
            right.postorder();

        System.out.print(data + " ");
    }

    public int height() {
        if(isLeaf())
            return 0;
        else if(hasOnlyLeft())
            return left.height() + 1;
        else if(hasOnlyRight())
            return right.height() + 1;
        else
            return max(left.height(), right.height()) + 1;
    }

    public void delete(int d) {
        if(left != null && left.data == d)
        {
            if(left.isLeaf()) left = null;
            else if(left.hasOnlyLeft()) left = left.left;
            else if(left.hasOnlyRight()) right = left.right;
            else {

                if(left.left.hasOnlyLeft() || left.left.isLeaf())
                {
                    left.data = left.left.data;
                    left.left = left.left.left;
                }

                else{

                    BSTNode predParent = left.left;
                    BSTNode pred = predParent.right;

                    while(pred.right != null)
                    {
                        predParent = pred;
                        pred = pred.right;
                    }

                    left.data = pred.data;
                    predParent.right = pred.left;

                }

            }
        }
        else if(right != null && right.data == d)
        {
            if(right.isLeaf()) right = null;
            else if(right.hasOnlyLeft()) left = right.left;
            else if(right.hasOnlyRight()) right = right.right;

            else {

                if(right.left.hasOnlyLeft() || right.left.isLeaf())
                {
                    left.data = right.left.data;
                    left.left = right.left.left;
                }

                else{

                    BSTNode predParent = right.left;
                    BSTNode pred = predParent.right;

                    while(pred.right != null)
                    {
                        predParent = pred;
                        pred = pred.right;
                    }

                    right.data = pred.data;
                    predParent.right = pred.left;

                }

            }

        }
        else if(left != null && d < data)
            left.delete(d);

        else if(right != null && d >= data)
            right.delete(d);
    }
}