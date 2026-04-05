public class Triee {

    // Node Class
    static class Node {

        Node children[];
        boolean eow;

        Node() {

            children = new Node[26]; // a to z

            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }

            eow = false;
        }
    }

    // Root Node
    static Node root = new Node();

    // Insert Method
    public static void insert(String word) {

        Node curr = root;

        for (int i = 0; i < word.length(); i++) {

            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {

                curr.children[idx] = new Node();
            }

            if (i == word.length() - 1) {

                curr.children[idx].eow = true;
            }

            curr = curr.children[idx];
        }
    }

    // Search Method
    public static boolean search(String key) {

        Node curr = root;

        for (int i = 0; i < key.length(); i++) {

            int idx = key.charAt(i) - 'a';

            Node node = curr.children[idx];

            if (node == null) {

                return false;
            }

            if (i == key.length() - 1 && node.eow == false) {

                return false;
            }

            curr = curr.children[idx];
        }

        return true;
    }

    // Main Method
    public static void main(String[] args) {

        String word[] = { "the", "a", "there", "their", "any" };

        for (int i = 0; i < word.length; i++) {

            insert(word[i]);
        }

        System.out.println(search("their")); // true
        System.out.println(search("thore")); // false
        System.out.println(search("any")); // true
        System.out.println(search("an")); // false
    }
}