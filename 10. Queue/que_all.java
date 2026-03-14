public class que_all {
    public static void main(String[] args) {
        Queue_arr que = new Queue_arr(10);
        que.enqueue(10);
        que.enqueue(43);
        que.enqueue(65);
        que.enqueue(12);
        que.enqueue(87);
        que.enqueue(4);
        que.enqueue(23);
        que.enqueue(12);

        que.display();

        que.dequeue();

        System.out.println(que.peek());
    }
}

class Queue_arr {
    int arr[];
    int front, rear, capacity;

    public Queue_arr(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
    }

    // enqueue ->
    public void enqueue(int item) {
        if (rear == capacity - 1) {
            System.out.println("Queue is full");
            return;
        }

        arr[++rear] = item;
    }

    int dequeue() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front++];
    }

    int peek() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    public void display() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}