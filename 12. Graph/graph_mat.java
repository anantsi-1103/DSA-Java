import java.util.Arrays;

public class graph_mat {

    static class GraphMatrix {
        int vertices;
        int[][] adjMatrix;

        GraphMatrix(int v) {
            this.vertices = v;
            adjMatrix = new int[v][v];
        }

        void addEdges(int u, int v) {
            adjMatrix[u][v] = 1; // 0 --- 1
            adjMatrix[v][u] = 1; // 1 --- 0
        }

        void printGraph() {
            for (int i = 0; i < vertices; i++) {
                System.out.println(Arrays.toString(adjMatrix[i]));
            }
        }
    }

    public static void main(String[] args) {
        GraphMatrix g = new GraphMatrix(4);

        g.addEdges(0, 1);
        g.addEdges(0, 2);
        g.addEdges(1, 2);
        g.addEdges(2, 3);

        g.printGraph();

    }
}
