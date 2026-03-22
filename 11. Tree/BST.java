class BST {

    class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    Node insert(Node root, int data) {

        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data)
            root.left = insert(root.left, data);

        else if (data > root.data)
            root.right = insert(root.right, data);

        return root;
    }

    void inorder(Node root) {

        if (root != null) {

            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);

        }
    }

    boolean search(Node root, int key) {

        if (root == null)
            return false;

        if (root.data == key)
            return true;

        if (key < root.data)
            return search(root.left, key);

        else
            return search(root.right, key);
    }

    public static void main(String[] args) {

        BST tree = new BST();

        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        System.out.println("Inorder Traversal:");
        tree.inorder(tree.root);

        System.out.println("\nSearch 40: "
                + tree.search(tree.root, 40));
    }
}
