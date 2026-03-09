public class cl_add {

    Node head;

    void InsertAtHead(int data) {
        // Node creation
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            // next-> 
            newNode.next = head;
            return;
        }

        Node temp = head;
        while(temp.next != head){
            temp = temp.next;

        }
        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }
    
    void InsertAtEnd(int data){
        Node newNode = new Node(data);


        if (head == null) {
            head = newNode;
            // next-> 
            newNode.next = head;
            return;
        }

        Node temp = head;

        while(temp.next != head){
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;

    }
    
    void deleteFirst(){
        if(head == null){
            return;
        }

        Node temp = head;

        while(temp.next != head){
            temp = temp.next;
        }

        head = head.next;
        temp.next = head;

    }

     void deleteLast(){
        if(head == null){
            return;
        }

        Node temp = head;

        while(temp.next.next != head){
            temp = temp.next;
        }
        temp.next = head;
        
    }

    void display(){
        if(head == null){
            return;
        }

        Node temp = head;

        do{
            System.out.print(temp.data + "->");
            temp = temp.next;
        }while(temp != head);
    }
    
    public static void main(String[] args) {
        
    }
}

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        next = null;
    }
}
