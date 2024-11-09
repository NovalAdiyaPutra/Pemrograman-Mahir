package GraphBFS;

public class GraphBfs {
    private String[] vertices;
    private boolean[][] edges;

    public GraphBfs(int n){
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

    public void printBfs(int fromIndex) {
        // Buat koleksi menggunakan Queue
        QueueBfs koleksi = new QueueBfs(this.vertices.length);
        boolean[] visited = new boolean[this.vertices.length];

        // Inisialisasi vertice awal
        koleksi.enqueue(fromIndex);

        // Selama koleksi tidak kosong
        while (!koleksi.isEmpty()) {

            // Ambil satu vertice
            int idVertice = koleksi.dequeue();

            // Proses
            System.out.println(this.vertices[idVertice]);

            // Tandai sebagai visited
            visited[idVertice] = true;

            // Ambil Neighbor yang unvisited
            for (int i = 0; i < this.vertices.length; i++){
                if (this.getEdges(idVertice,i) && !visited[i]){
                    koleksi.enqueue(i);
                    visited[i] = true;
                }
            }
        }

    }
}
