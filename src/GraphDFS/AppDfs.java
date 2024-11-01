package GraphDFS;

public class AppDfs {
    public static void main(String[] args) {
        Graph graph = new Graph(7);
        graph.setVertices(0,"A");
        graph.setVertices(1,"B");
        graph.setVertices(2,"C");
        graph.setVertices(3,"D");
        graph.setVertices(4,"E");
        graph.setVertices(5,"F");
        graph.setVertices(6,"G");

        graph.setEdges(0,1,true); // A ke B
        graph.setEdges(0,2,true); // A ke C
        graph.setEdges(0,3,true); // A ke D
        graph.setEdges(1,3,true); // B ke D
        graph.setEdges(1,4,true); // B ke E
        graph.setEdges(2,6,true); // C ke G
        graph.setEdges(3,4,true); // D ke E
        graph.setEdges(3,5,true); // D ke F
        graph.setEdges(3,6,true); // D ke G
        graph.setEdges(4,5,true); // E ke F

        graph.printDfs(2);
    }
}
