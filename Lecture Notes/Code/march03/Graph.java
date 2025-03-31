import java.util.*;

public class Graph {
    int numvertices;
    int numStrongConnectedComponents;
    ArrayList<Vertex> vertices;

    public Graph() {
        numvertices=0;
        numStrongConnectedComponents=0;
        vertices = new ArrayList<Vertex>();
    }
    public boolean isStronglyConnected(Vertex v1, Vertex v2) {
        return canReach(v1,v2) && canReach(v2,v1);
    }

    public void addEdge(int i, int j) {
        vertices.get(i).neig.add(vertices.get(j));
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

    public HashSet<Vertex> reachables(Vertex from) {
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

        return visited;
    }

    public Graph invert() {
        Graph result = new Graph();
        for(Vertex v:this.vertices)
            result.vertices.add(new Vertex(v.id));
        for(Vertex w:this.vertices) {
            for(Vertex ng:w.neig) {
                result.vertices.get(ng.id).neig.add(result.vertices.get(w.id));
            }
        }
        return result;
    }

    public void setStrongConnectedComponents() {
        int tofind=vertices.size();
        int sccno=0;
        while(tofind>1) {
            int u = 1;
            while(vertices.get(u).scc>=0) u++;
            HashSet rminus = this.reachables(this.vertices.get(u));

            System.out.println("Rminus: [");
            Iterator<Vertex> itr=rminus.iterator();    
            while(itr.hasNext()){    
            System.out.print(" "+itr.next().id);
            }
            System.out.println("]");

            Graph invg = this.invert();

            HashSet rplus = invg.reachables(invg.vertices.get(u));
            System.out.println("Rplus: [");
            Iterator<Vertex> itr2=rplus.iterator();    
            while(itr2.hasNext()){    
            System.out.print(" "+itr2.next().id);
            }
            System.out.println("]");
            
            for(int i=1; i<vertices.size(); i++) {
                if(rminus.contains(vertices.get(i)) && rplus.contains(invg.vertices.get(i))){
                    vertices.get(i).scc=sccno;
                    System.out.println("scc of "+vertices.get(i).id+" = "+vertices.get(i).scc);
                    tofind--;
                }
            }
            
            
            
            
            
            sccno++;
        }
    }

    public static void main (String [] args) {
        Graph g = new Graph();

        
        for(int i=0; i<=6; i++)
            g.vertices.add(new Vertex(i));
        g.vertices.get(1).neig.add(g.vertices.get(5));
        g.addEdge(2,1);
        g.vertices.get(3).neig.add(g.vertices.get(1));
        g.vertices.get(3).neig.add(g.vertices.get(2));
        g.vertices.get(3).neig.add(g.vertices.get(5));
        g.vertices.get(4).neig.add(g.vertices.get(3));
        //g.vertices.get(4).neig.add(g.vertices.get(6));
        g.vertices.get(5).neig.add(g.vertices.get(3));
        g.vertices.get(6).neig.add(g.vertices.get(5));
        g.vertices.get(6).neig.add(g.vertices.get(4));

        g.setStrongConnectedComponents();

        for(Vertex w:g.vertices) {
            System.out.println(w.id+" : scc->"+w.scc);
        }
      

        
        
        
        /*Vertex[] v = new Vertex[9];
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
        */
    }
}


