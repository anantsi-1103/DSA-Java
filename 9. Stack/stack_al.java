public class stack_al {
    public static void main(String[] args) {
        MyStack s = new MyStack(5);

        s.push(10);
        s.push(20);
        s.push(45);
        s.push(34);
        s.push(345);
       
        // display to element
        System.out.println(s.peek());

        // pop
        s.pop();

        s.push(4543);

        System.out.println(s.peek());



    }
}

class MyStack {
    int arr[];
    int top;
    int capacity;

    // MyStack
    MyStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow!!!!");
            return;
        }

        // data insert
        arr[++top] = x;
    }

    int pop() {
        if (isEmpty()) {
            System.err.println("Stack Underflow");
            return -1;
        }

        return arr[top--];

    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        } else {
            return -1;
        }
    }

    public int size() {
        return top + 1;
    }
}
