package Graph;

public class AppGraph {
    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.setVertice(0,"Jakarta");
        graph.setVertice(1,"Bandung");

        graph.setEdge(0,2,3);
    }
}
