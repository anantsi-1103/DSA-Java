
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class HashTable {
    int size = 10; // size of hash table
    Node[] table;

    // constructor
    HashTable() {
        table = new Node[size];

        // intialize table
        for (int i = 0; i < size; i++) {
            table[i] = null;
        }
    }

    int hashFunction(int key) {
        return key % size;
    }

    // insert
    void insert(int key) {

        int idx = hashFunction(key);

        Node newNode = new Node(key);

        // if position is empty
        if (table[idx] == null) {
            table[idx] = newNode;
        }

        // already value - collison -> Separate chaining
        else {
            Node temp = table[idx];

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

        System.out.println("Inserted At key " + key + "at index " + idx);
    }

    boolean Search(int key) {
        int idx = hashFunction(key);

        Node temp = table[idx];

        while (temp != null) {
            if (temp.data == key) {
                return true;
            }

            temp = temp.next;
        }
        return false;
    }

    // delete a function
    void delete(int key) {
        int idx = hashFunction(key);

        Node temp = table[idx];

        Node prev = null;

        if (temp == null) {
            System.out.println("no key exist");
        }

        // if first node is key
        if (temp.data == key) {
            table[idx] = temp.next;

            System.out.println("deleted " + key);
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // if(temp == null){
        // System.out.println("Key not found");
        // }

        prev.next = temp.next;

        System.out.println("Deleted " + key);
    }

    void display() {
        System.out.println("\n Hash Table: ");

        for (int i = 0; i < size; i++) {
            System.out.print(i + " -> ");

            Node temp = table[i];

            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }

            System.out.println("null");
        }
    }
}

public class has1 {
    public static void main(String[] args) {

        HashTable ht = new HashTable();

        ht.insert(12);
        ht.insert(22);
        ht.insert(54);
        ht.insert(76);
        ht.insert(99);
        ht.insert(21);
        ht.insert(17);
        ht.insert(37);
        ht.insert(72);

        ht.display();

        System.out.println(ht.Search(220));

        ht.delete(22);

        ht.display();

    }
}
