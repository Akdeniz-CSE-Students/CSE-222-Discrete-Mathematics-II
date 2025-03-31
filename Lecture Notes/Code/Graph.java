import java.util.*;

public class Graph {
    int numvertices;
    ArrayList<Vertex> vertices;

    public Graph() {
        numvertices=0;
        vertices = new ArrayList<Vertex>();
    }
    public boolean isStronglyConnected(Vertex v1, Vertex v2) {
        return canReach(v1,v2) && canReach(v2,v1);
    }
    public boolean canReach(Vertex from, Vertex to) {
        ArrayList<Vertex> L = new ArrayList<Vertex>();
        L.add(from);
        HashSet<Vertex> visited = new HashSet<Vertex>();
        visited.add(from);
        
        while(L.size()>0) {
            Vertex u = L.get(0);
            //Vertex u = L.get(L.size()-1);
            int i=0;
            while(i<u.neig.size() && visited.contains(u.neig.get(i))) {
                i++;
            }
            if(i==u.neig.size()) {
                L.remove(u);
                for(Vertex w:L) {
                    System.out.print(" "+w.id);
                }
                System.out.println();
            }
            else {
                visited.add(u.neig.get(i));
                L.add(u.neig.get(i));
                for(Vertex w:L) {
                    System.out.print(" "+w.id);
                }
                System.out.println();
            }

        }

        return visited.contains(to);
    }

    public static void main (String [] args) {
        Graph g = new Graph();
        Vertex[] v = new Vertex[9];
        for(int i=1; i<=8; i++)
            v[i]=new Vertex(i);
        v[1].neig.add(v[2]);
        v[1].neig.add(v[4]);
        v[1].neig.add(v[5]);
        v[1].neig.add(v[6]);

        v[2].neig.add(v[1]);
        v[2].neig.add(v[5]);

        v[3].neig.add(v[4]);
        v[3].neig.add(v[7]);
        v[3].neig.add(v[8]);

        v[4].neig.add(v[1]);
        v[4].neig.add(v[3]);
        v[4].neig.add(v[6]);

        v[5].neig.add(v[1]);
        v[5].neig.add(v[2]);
        v[5].neig.add(v[6]);

        v[6].neig.add(v[1]);
        v[6].neig.add(v[4]);
        v[6].neig.add(v[5]);

        v[7].neig.add(v[3]);

        v[8].neig.add(v[3]);
        
        System.out.println(g.canReach(v[2],v[8]));

    }
}


