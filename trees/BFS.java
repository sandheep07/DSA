package trees;

import java.util.LinkedList;

public class BFS {
    
    private int V;
    private LinkedList<Integer> adj[];
    


    BFS(int v){
        V=v;
        adj = new LinkedList[v];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int source,int destination){
        adj[source].add(destination);

    }

    void BinarySearchTraversal(int s){

        boolean visited[] = new boolean[V];
        
        LinkedList<Integer> queue = new LinkedList<>();
  
        visited[s]= true;
        queue.add(s);


        while(queue.size()!=0){
            
            s = queue.poll();
            System.out.print(s+" ");
            visited[s] = true;
            
            for(int neighbour: adj[s]){
                 
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    queue.add(neighbour);
                }
            } 
        }
    }


    public static void main(String[] args) {
        BFS obj = new BFS(4);  
        
        
        
        int arr[][] = {{0,1,1,0},{0,0,1,0},{1,0,0,1},{0,0,0,1}};
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(arr[i][j] == 1){
                    obj.addEdge(i, j);
                } 
            }
        }

        obj.BinarySearchTraversal(2);
        
    }

    
}
