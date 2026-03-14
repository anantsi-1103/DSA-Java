public class Deque {
    public static void main(String[] args) {
        DequeLL d = new DequeLL();
        d.insertFront(10);
        d.insertAtEnd(20);
        d.insertFront(40);
        d.insertAtEnd(40);
        d.insertFront(50);

        d.displayForward();
    }
}

class DequeLL {
    Node front;
    Node rear;

    void insertFront(int data) {
        Node newNode = new Node(data);

        if (front == null) {
            front = rear = newNode;
            return;
        }

        newNode.next = front;
        front.prev = newNode;
        front = newNode;

    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (front == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        newNode.prev = rear;
        rear = newNode;

    }

    void deleteFront() {
        if (front == null) {
            System.out.println("Dequeu is empty");
            return;
        }

        if (front == rear) {
            front = rear = null;
            return;
        }

        front = front.next;
        front.prev = null;
    }

    void DeleteRear() {
        if (rear == null) {
            System.out.println("Deque is empty");
            return;
        }

        if (front == rear) {
            front = rear = null;
            return;
        }

        rear = rear.prev;
        rear.next = null;
    }

    // peek front
    void getFront() {
        if (front == null) {
            System.out.println("Dequeu is empty");
            return;
        }

        System.out.println("Front : " + front.data);
    }

    // peek rear
    void getrear() {
        if (rear == null) {
            System.out.println("Deque is empty");
            return;
        }

        System.out.println("Rear : " + rear.data);
    }

    void displayForward() {
        Node temp = front;

        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    void displayBackward() {
        Node temp = rear;

        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.prev;
        }

        System.out.println("null");
    }
}

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}