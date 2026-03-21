import java.util.Stack;

public class Queue_que {
    public static void main(String[] args) {
        QueueUsingStack que = new QueueUsingStack();

        que.enqueue(10);
        que.enqueue(20);
        que.enqueue(30);

        System.out.println(que.dequeue());
    }
}

class QueueUsingStack{
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    

    // enqueue
    public void enqueue(int x){
        s1.push(x);
        System.out.println(x + " inserted");
    }

    // dequeue
    public int dequeue(){
        if(s1.isEmpty() && s2.isEmpty()){
            System.out.println("queue is emptyu");
            return -1;
        }

        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

}