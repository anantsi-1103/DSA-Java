import java.util.LinkedList;
import java.util.Queue;

public class bfs_graph {
    int vertices;
    LinkedList<Integer>[] li;

    bfs_graph(int v) {
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

    void bfs(int start) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        System.out.println("BFS Traversal is starting from : " + start);

        while (!queue.isEmpty()) {
            int n = queue.poll();
            System.out.print(n + " ");

            // 0 : li[n]
            // 0 : 2,3,4
            for(int node : li[n]){
                if(!visited[node]){
                    visited[node] = true;

                    queue.add(node);
                }
            }
        }
    }

    public static void main(String[] args) {
        bfs_graph bfs = new bfs_graph(5);

        bfs.addEdge(0, 3);
        bfs.addEdge(3, 1);
        bfs.addEdge(1, 2);
        bfs.addEdge(1, 4);

        bfs.bfs(0);
    }

}
