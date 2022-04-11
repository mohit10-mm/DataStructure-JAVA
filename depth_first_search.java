import java.util.ArrayList;
import java.util.Stack;

public class depth_first_search {
    int V;                                   // V is for vertices 

    ArrayList<Integer>[] adj;                // AraayList helps to store data dynamically i.e it grows and shrinks according to data
    depth_first_search(int noofvertex){      // construct for class depth_first_search , this constructor is used to intialize adj list , no of vertices etc.
        V = noofvertex;
        adj = new ArrayList[noofvertex];     // initalizing adj list
        for(int i = 0; i< noofvertex; i++){
            adj[i] = new ArrayList<>();      // adj is itself a list , it contains all the vertices and every element there contains a list of those vertices which are directly related to that vertex 
        }
    }

    // creating elments inside adj list
    void edge(int x, int y){             //edge defines relationship b/w 2 vertices x and y
        adj[x].add(y);                   // add will add those vertices which are related to x
    }

    // function of depth first search
    void depthfirstsearch(int sourcevertex){    //  first vertex is given as input as sourcevertex
        boolean[] visited = new boolean[V];     //  visited array  will keep note of which nodes are visited, boolean type because it has output true or false
        Stack<Integer> s1 = new Stack<>();      //  creating stack class

        s1.push(sourcevertex);                  // every time we need to peek into the stackand see which is the top most element and then need to pop it outand then go to adjancey list and and chek which vertex are connected to them and insert them into stack again
        int node;
        while(!s1.empty()){                     // while there is some element in stack we need to do it again
            sourcevertex = s1.peek();
            s1.pop();                           // pop out top most element
            for(int i = 0; i<adj[sourcevertex].size();i++){    // check the adj list and mark the visited node true
                node = adj[sourcevertex].get(i);                 
                if(!visited[node]){                           // if visited array is true that means it is already visited
                s1.push(node); 

                }
            }
            if (visited[sourcevertex] == false){
            System.out.print(sourcevertex+ " ");
            visited[sourcevertex] = true;
                }
        }
    }


    public static void main(String[] args){
        depth_first_search g1 = new depth_first_search(6);
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
        
        System.out.print("result of depth first search"+ "  ");
        g1.depthfirstsearch(0);


    }
    
}
