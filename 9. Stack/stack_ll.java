public class stack_ll {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.push(10);
        ll.push(20);
        ll.push(30);
        ll.push(50);
        ll.push(40);
        ll.push(90);

        System.out.println(ll.peek());
        ll.pop();
        System.out.println(ll.peek());


    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node top;

    // push
    public void push(int x) {
        Node newNode = new Node(x); // node banaya
        newNode.next = top; // new node ke next ko top ko refer
        top = newNode; // top ko new node pr shift krdiya
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int val = top.data;
        top = top.next;
        return val;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (!isEmpty()) {
            return top.data;
        } else {

            return -1;
        }
    } 
}