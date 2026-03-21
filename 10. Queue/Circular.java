public class Circular {
    int arr[];
    int size;
    int front;
    int rear;

    Circular(int n) {
        size = n;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    // enqueue
    public void enqueue(int x) {
        // queue is full
        if ((rear + 1) % size == front) {
            System.out.println("Queue is full");
            return;
        }

        if (front == -1) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % size;
        }

        arr[rear] = x;
        System.out.println("Inserted " + x);
    }

    public int dequeue() {
        // queue is full
        if (front == -1) {
            System.out.println("Queue is empty");
            return -1;
        }

        int res = arr[front];

        // last element removed
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }

        return res;
    }

    public void display() {
        // queue is full
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }

        int i = front;

        while (true) {
            System.out.print(arr[i] + " ");

            if (i == rear) {
                break;
            }
            i = (i + 1) % size;
        }

        System.out.println();
    }

    public static void main(String args[]) {
        Circular c = new Circular(5);
        c.enqueue(10);
        c.enqueue(20);
        c.enqueue(40);

        c.display();

        c.dequeue();
        c.display();

        c.enqueue(50);
        c.enqueue(80);
        c.enqueue(100);

        c.display();

    }
}
