class BinaryTree {

    // Node class
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    // Root of tree
    Node root;

    // PreOrder Traversal
    void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // InOrder Traversal
    void InOrder(Node root) {
        if (root == null) {
            return;
        }

        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);
    }

    // PostOrder Traversal
    void PostOrder(Node root) {
        if (root == null) {
            return;
        }

        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data + " ");
    }

    int height(Node root) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    int count(Node root) {
        if (root == null) {
            return 0;
        }

        int lc = count(root.left);
        int rc = count(root.right);
        return lc + rc + 1;
    }

    int Sum_node(Node root) {
        if (root == null) {
            return 0;
        }

        int leftSum = Sum_node(root.left);
        int rightSum = Sum_node(root.right);
        return leftSum + rightSum + root.data;

    }

    public static void main(String[] args) {

        BinaryTree t1 = new BinaryTree();

        // Creating tree
        t1.root = new Node(1);
        t1.root.left = new Node(2);
        t1.root.right = new Node(3);

        t1.root.left.left = new Node(4);
        t1.root.left.right = new Node(5);

        t1.root.right.left = new Node(6);
        t1.root.right.right = new Node(7);

        System.out.println("PreOrder:");
        t1.preOrder(t1.root);

        System.out.println("\nInOrder:");
        t1.InOrder(t1.root);

        System.out.println("\nPostOrder:");
        t1.PostOrder(t1.root);
    }
}