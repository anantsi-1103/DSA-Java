import java.util.Queue;
import java.util.LinkedList;

public class MyStack {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>(); // main queue -> store stack element
        q2 = new LinkedList<>(); // helper queue
    }
    
    public void push(int x) {
        q2.offer(x); // push

        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        
    }
    
    public int pop() {
        return q1.poll();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}


