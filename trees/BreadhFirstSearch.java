package trees;
import java.io.*;
import java.util.*;

class BreadhFirstSearch
{
	private int V; // No. of vertices
	private LinkedList<Integer> adj[]; //Adjacency Lists

	BreadhFirstSearch(int v)
	{
		V = v;
		adj = new LinkedList[v];
		for (int i=0; i<v; ++i)
			adj[i] = new LinkedList();
	}


	void addEdge(int v,int w)
	{
		adj[v].add(w);
    
	}

	
	void BFS(int s)
	{
		
		boolean visited[] = new boolean[V];

		LinkedList<Integer> queue = new LinkedList<Integer>();

		
		visited[s]=true;
		queue.add(s);

		while (queue.size() != 0)
		{
			
			s = queue.poll();
			System.out.print(s+" ");

            for(int neighbour : adj[s]){

				if (!visited[neighbour])
				{
					visited[neighbour] = true;
					queue.add(neighbour);
				}
            }
			
		}
	}


	public static void main(String args[])
	{
		BreadhFirstSearch g = new BreadhFirstSearch(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 0);
        g.addEdge(2, 3);
        g.addEdge(2, 0);
 


		System.out.println("Following is Breadth First Traversal "+
						"(starting from vertex 2)");

		g.BFS(2);
	}
}

