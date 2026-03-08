public class ll_add {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void InsertAtHead(int data) {
        Node newNode = new Node(data); // creation of new node

        if (head == null) { // head khali hai
            head = tail = newNode;
        }

        newNode.next = head; // newnode ko bolo ki head ko refer kre
        head = newNode; // head chala jaega newNode ke pass
    }

    public void InsertAtEnd(int data) {
        Node newNode = new Node(data); // creation of new node

        if (head == null) { // head khali hai
            head = tail = newNode;
        }

        tail.next = newNode; // newnode ko bolo ki head ko refer kre
        tail = newNode; // head chala jaega newNode ke pass
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public int removeFirst() {
        int val = head.data;
        head = head.next;
        return val;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    public boolean Search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static boolean isCycle(int key) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(int key) {
        Node slow = head;
        Node fast = head;

        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        slow = head;
        Node prev = null;

        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;

    }

    public static void main(String[] args) {

    }
}
