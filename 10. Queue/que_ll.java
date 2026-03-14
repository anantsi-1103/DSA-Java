public class que_ll {

    Node front , rear;

    public void que_all(){
        front = rear = null;
    }

    public void enqueue(int data){
        Node newNode = new Node(data);

        if(rear == null){
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    int dequeue(){
        if(front == null){
            System.out.println("Queue is empty");
            return -1;
        }

        int item = front.data;
        front = front.next;
        return item;
    }

    int peek(){
        if(front == null){
            System.out.println("Queue is empty");
            return -1;
        }

        return front.data;

    }

    public void display(){
        if(front == null){
            System.out.println("Queue is empty");
            return;
        }

        Node temp = front;
        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println("null");


    }
    public static void main(String[] args) {
        que_ll que = new que_ll();

        que.enqueue(20);
        que.enqueue(40);
        que.enqueue(90);

        que.display();
        
        que.dequeue();
        que.display();
    }
}
// class Node{
//     int data;
//     Node next;

//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }
