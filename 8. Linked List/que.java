public class que {


    Node reverse(Node head){

        Node prev = null;
        Node curr = head;

        while(curr != null){
            
            // apke curr se aage wale number ko grab
            Node next = curr.next;
            // curr wale k next ko prev
            curr.next = prev;
            // prev = curr ki jagah
            prev = curr;
            // curr bhej diya next ki jagah
            curr = next;
        }
        return prev;
    }

    Node findMiddle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    
    public static void main(String[] args) {
        
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