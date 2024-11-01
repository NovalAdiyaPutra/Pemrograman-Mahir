package GraphDFS;

public class Graph {
    private String[] vertices;
    private boolean[][] edges;

    public Graph(int n){
        this.vertices = new String[n];
        this.edges = new boolean[n][n];
    }

    public void setVertices(int index,String value) {
        this.vertices[index] = value;
    }

    public String getVertices(int index) {
        return this.vertices[index];
    }

    public void setEdges(int fromIndex,int toIndex,boolean value) {
        this.edges[fromIndex][toIndex] = value;
        this.edges[toIndex][fromIndex] = value;
    }

    public boolean getEdges(int fromIndex,int toIndex) {
        return this.edges[fromIndex][toIndex];
    }

    public void printDfs(int fromIndex) {
        // Buat koleksi menggunakan stack
        Stack koleksi = new Stack(this.vertices.length);
        boolean[] visited = new boolean[this.vertices.length];

        // Inisialisasi vertice awal
        koleksi.push(fromIndex);

    }
}
