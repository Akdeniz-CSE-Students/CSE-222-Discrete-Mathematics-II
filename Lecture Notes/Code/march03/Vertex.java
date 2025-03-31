import java.util.*;

public class Vertex {
    int id;
    boolean visited;
    int scc;
    ArrayList<Vertex> neig;

    public Vertex(int id) {
        this.id = id;
        this.scc = -1;
        this.neig = new ArrayList<>();
    }

    
}