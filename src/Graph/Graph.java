package Graph;

public class Graph {
    private String[] vertices;
    private int[][] edges;

    public Graph(int n) {
        vertices = new String[n];
        edges = new int[n][2];

    }

    public void setVertice(int index, String value) {
        if (index < this.vertices.length) {
            this.vertices[index] = value;
        } else {
            System.out.println("Oppss... diluar dari range");
        }
    }

    public void setEdge(int id, int from, int to) {
        this.edges[id][0] = from;
        this.edges[id][1] = to;
    }

    public boolean isAdjacent(int from, int to) {
        boolean hasil = false;
        for (int i = 0; i < this.edges.length; i++) {
            if (this.edges[i][0] == from && this.edges[i][1] == to) {
                hasil = true;
                break;
            }
        }
        return hasil;
    }

    public int[] neighbors(int from) {
        int[] hasil = new int[this.edges.length];
        int n = 0;
        for (int i = 0; i < this.edges.length; i++) {
            if (this.edges[1][0] == from) {
                hasil[n] = this.edges[1][1];
            } else if (this.edges[1][1] == from) {
                hasil[n] = this.edges[i][0];
                n++;
            }
        }
        return hasil;
    }
}