import java.util.LinkedList;


class GraphList{
    int vertices;
    LinkedList<Integer>[] adjList;

    public GraphList(int v){
        vertices = v;
        adjList = new LinkedList[v];
        for(int i = 0 ; i< v ; i++){
            adjList[i] = new LinkedList<>();
        }
    }

    void addEdge(int u , int v){
        adjList[u].add(v);
        adjList[v].add(u);
    }

    void printGraph(){
        for(int i = 0 ;i<vertices ; i++){
            System.out.print(i+" -> ");
            for(int node : adjList[i]){
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphList g = new GraphList(5);

        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1,2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        g.printGraph();
    }
}