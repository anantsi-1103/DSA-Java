public class prims {

    static int V = 5;

    int minKey(int key[], boolean mstSet[]) {
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < V; v++) {
            if (!mstSet[v] && key[v] < min) {
                min = key[v];
                min_index = v;
            }
        }
        return min_index;
    }

    void primMst(int graph[][]) {
        int parent[] = new int[V];
        int key[] = new int[V];
        boolean mstSet[] = new boolean[V];

        for (int i = 0; i < V; i++) {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
        }

        key[0] = 0;
        parent[0] = -1;

        for (int c = 0; c < V - 1; c++) {
            int u = minKey(key, mstSet);

            mstSet[u] = true;

            // update adjacent vertics
            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    // parent[2] = 1
                    key[v] = graph[u][v];
                    // key[2] = 3;
                }
            }
        }
        printMst(parent, graph);
    }

    public static void printMst(int parent[], int graph[][]) {
        System.out.println("Edge \t Weight");
        for (int i = 1; i < V; i++) {
            System.out.println(parent[i] + " - " +i+ "\t" + graph[i][parent[i]]);
        }
    }

    public static void main(String[] args) {
        prims p = new prims();
        int graph[][] = new int[][] {
                { 0, 2, 0, 6, 0 },
                { 2, 0, 3, 8, 5 },
                { 0, 3, 0, 0, 7 },
                { 6, 8, 0, 0, 0 },
                { 0, 5, 7, 0, 0 }
        };

        p.primMst(graph);
    }
}
