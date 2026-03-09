public class dl_add {

    Node head;

    void InsertAtHead(int data) {
        // Node creation
        Node newNode = new Node(data);

        if (head != null) {
            head.prev = newNode;
            newNode.next = head;
        }
        head = newNode;
    }

    void InsertAtEnd(int data) {

        // Node creation
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;

        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    void insertAtPosition(int pos, int data) {
        // Node creation
        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
    }

    void deleteFromBegining() {
        if (head == null) {
            return;
        }

        head = head.next;

        if (head != null) {
            head.prev = null;
        }
    }

    void deleteEnd() {
        if (head == null) {
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        if (temp.prev != null) {
            temp.prev.next = null;
        }
    }

    void displayForward() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    void displayBackward() {
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.prev;
        }

    }

    public static void main(String[] args) {

    }
}

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}