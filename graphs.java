import java.util.*;
public class graphs {
    static class edge{
        int src;
        int dest;
        int wt;

        public edge(int s, int d, int w){
            this.src= s;
            this.dest= d;
            this.wt= w;
        }
    }
    static void creatGraph(ArrayList<edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i]= new ArrayList<>();
        }
        graph[0].add(new edge(1, 0, 1));
        graph[0].add(new edge(1, 2, 1));

        graph[1].add(new edge(0, 1, 1));
        graph[1].add(new edge(0, 2, 1));

        graph[2].add(new edge(2, 0, 1));
        graph[2].add(new edge(2, 1, 1));

    }
    public static void main(String args[]){
        ArrayList<edge> graph[]= new ArrayList[3];
        creatGraph(graph);
        for(int i=0; i<graph.length; i++){
            System.out.println(i);
        }
    }
}
