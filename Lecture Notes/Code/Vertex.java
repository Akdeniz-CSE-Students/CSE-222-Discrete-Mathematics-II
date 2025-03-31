import java.util.*;

public class Vertex {
    int id;
    ArrayList<Vertex> neig;

    public Vertex(int id) {
        this.id = id;
        this.neig = new ArrayList<>();
    }
}