import java.util.Arrays;

public class dijkstra {
    static final int V = 4;

    void dijkstralogic(int graph[][], int src) {
        int dist[] = new int[V]; // dist[4]
        boolean set[] = new boolean[V]; // set[4]

        Arrays.fill(dist, Integer.MAX_VALUE); // dist max 
        Arrays.fill(set, false); // false

        dist[src] = 0; // 0

        for (int c = 0; c < V - 1; c++) { // 0
            int u = minDist(dist, set); // 
                // u 
            set[u] = true; 

            // update -> if aaage jake or choti value milit hai toh
            for (int v = 0; v < V; v++) {
                if (!set[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }
        printSolution(dist);
    }

    void printSolution(int dist[]) {
        System.out.println("Vertex \t Distance from Source");
        for (int i = 0; i < V; i++) {
            System.out.println(i + "\t \t" + dist[i]);
        }
    }

    int minDist(int dist[], boolean set[]) {
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < V; v++) {
            if (!set[v] && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }
        }
        return min_index;
    }

    public static void main(String[] args) {
        int graph[][] = new int [][] {
            {0,5,8,0},
            {5,0,9,2},
            {8,9,0,6},
            {0,2,6,0},
        };

        dijkstra dj = new dijkstra();
        dj.dijkstralogic(graph,0);
    }
}
