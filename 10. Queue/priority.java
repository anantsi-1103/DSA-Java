// import java.util.Collection;
// import java.util.Collections;
// import java.util.PriorityQueue;

class priority {
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // pq.add(30);
        // pq.add(10);
        // pq.add(20);
        // pq.add(70);
        // pq.add(40);

        // // System.out.println(pq);

        // while(!pq.isEmpty()){
        // System.out.println(pq.poll());
        // }

        PriorityQueueArray pq = new PriorityQueueArray();

        pq.insert(30);
        pq.insert(10);
        pq.insert(20);
        pq.insert(70);
        pq.insert(40);

        

    }
}

class PriorityQueueArray {
    int arr[] = new int[100];
    int size = 0;

    // void insert
    void insert(int x) {
        int i = size - 1;

        // shift element
        while (i >= 0 && arr[i] > x) {
            arr[i + 1] = arr[i];
            i--;
        }

        arr[i + 1] = x;
        size++;
    }

    int remove() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }

        return arr[--size];
    }

}