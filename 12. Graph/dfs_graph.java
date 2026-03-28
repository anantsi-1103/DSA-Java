import java.util.LinkedList;
import java.util.Queue;

public class dfs_graph {
    int vertices;
    LinkedList<Integer>[] li;

    dfs_graph(int v) {
        this.vertices = v;
        li = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            li[i] = new LinkedList<>();
        }
    }

    void addEdge(int u, int v) {
        li[u].add(v);
        li[v].add(u);
    }

    void DFS(int start) {
        boolean[] visited = new boolean[vertices];
        dfsHelper(start, visited);
    }

    void dfsHelper(int node, boolean[] visited) { // 3 , visited
        visited[node] = true; //
        // 0 4 2
        System.out.print(node + " ");
        // 2 : 4 3
        for (int n : li[node]) {
            // visited[4]
            if (!visited[n]) {
                dfsHelper(n, visited);
            }
        }

    }

    public static void main(String[] args) {
        dfs_graph g = new dfs_graph(6);
        g.addEdge(0, 4);

        g.addEdge(4, 2);
        g.addEdge(4, 1);

        g.addEdge(2, 3);

        g.addEdge(3, 5);

        g.addEdge(5, 1);

        g.DFS(0);
    }
}
