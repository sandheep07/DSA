package trees;

import java.util.LinkedList;

public class DFS {
     private int V; // nof edges
     private LinkedList<Integer> adj[]; // list

     DFS(int v){
         V=v;
         adj = new LinkedList[v];
         for (int i = 0; i < V; i++) {
             adj[i] = new LinkedList();
         }
     }

     void addEdge(int v, int w)
     {
         adj[v].add(w); // Add w to v's list.
     }

     void DepthUtil(int v,boolean visited[]){

        visited[v] = true;
        System.out.println(v + " ");

        for(int neighbour : adj[v]){

            if (!visited[neighbour])
            {
               DepthUtil(neighbour,visited);
            }
        }

     }

     
     void DepthFirstSearch(int v){
        boolean[] visited  = new boolean[V];
        DepthUtil(v, visited);
     }

     public static void main(String[] args) {
        DFS g = new DFS(4);

        int arr[][] = {{0,1,1,0},{0,0,1,0},{1,0,0,1},{0,0,0,1}};
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(arr[i][j] == 1){
                    g.addEdge(i, j);
                } 
            }
        }

		System.out.println("Following is Breadth First Traversal "+
						"(starting from vertex 2)");

		g.DepthFirstSearch(2); 
     }
}
