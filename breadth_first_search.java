import java.util.ArrayList;
import java.util.Iterator;

public class breadth_first_search {
    int V;                                // V is for vertices 

    ArrayList<Integer> adj[];              // AraayList helps to store data dynamically i.e it grows and shrinks according to data
    breadth_first_search(int noofvertex){  // construct for class breadth_first_search , this constructor is used to intialize adj list , no of vertices etc.
        V = noofvertex;
        adj = new ArrayList[noofvertex];   // initalizing adj list
        for(int i = 0; i< noofvertex; i++){
            adj[i] = new ArrayList<>();     // adj is itself a list , it contains all the vertices and every element there contains a list of those vertices which are directly related to that vertex 
        }
    }

    void edge(int x, int y){  //edge defines relationship b/w 2 vertices x and y
        adj[x].add(y);        // add will add those vertices which are related to x
    }

    // function for breadthfirstsearch
    void breadthfirstsearch(int sourcevertex){  //  first vertex is given as input as sourcevertex  
        boolean[] visited = new boolean[V];     //  visited array  will keep note of which nodes are visited, boolean type because it has output true or false
        ArrayList<Integer> a1 = new ArrayList<Integer>();   // 
        visited[sourcevertex] = true;                      // marking it true for source vertex
        a1.add(sourcevertex);                              // adding source vertex to a1
        while(!a1.isEmpty()){                              // until the list become empty we had to repeat this task of deleting topone and adding directly related vertices
            sourcevertex = a1.remove(0);
            System.out.print(sourcevertex+ " ");
            Iterator i = adj[sourcevertex].iterator();    // we need to iterate over it to find out other vertices 
            while(i.hasNext()){
                int n = (int) i.next();
            if(!visited[n]){                           // if the vertex is already visited than we should not revisit that vertex
                visited[n] = true;
                a1.add(n);
            }
            }
        }
    }
    
    
    
    public static void main(String[]  args){
        breadth_first_search g1 = new breadth_first_search(6);
        g1.edge(0,1);
        g1.edge(0,2);
        g1.edge(0,5);
        g1.edge(1,0);
        g1.edge(1,2);
        g1.edge(2,0);
        g1.edge(2,1);
        g1.edge(2,3);
        g1.edge(2,4);
        g1.edge(3,2);
        g1.edge(4,2);
        g1.edge(4,5);
        g1.edge(5,0);
        g1.edge(5,4);

        g1.breadthfirstsearch(0);

    }
    
}
