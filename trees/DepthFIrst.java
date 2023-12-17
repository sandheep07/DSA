package trees;

import java.io.*;
import java.util.*;

class DepthFirst {
	private int V; 
	private LinkedList<Integer> adj[];

	// Constructor
	@SuppressWarnings("unchecked") DepthFirst(int v)
	{
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList();
	}

	// Function to add an edge into the graph
	void addEdge(int v, int w)
	{
		adj[v].add(w); // Add w to v's list.
	}

	// A function used by DFS
	void DFSUtil(int v, boolean visited[])
	{
		// Mark the current node as visited and print it
		visited[v] = true;
		System.out.print(v + " ");

		// Recur for all the vertices adjacent to this
		// vertex
        for(int neighbour : adj[v]){

            if (!visited[neighbour])
            {
               DFSUtil(neighbour, visited);
            }
        }
	}

	// The function to do DFS traversal.
	// It uses recursive
	// DFSUtil()
	void DFS(int v)
	{
		// Mark all the vertices as
		// not visited(set as
		// false by default in java)
		boolean visited[] = new boolean[V];

		// Call the recursive helper
		// function to print DFS
		// traversal
		DFSUtil(v, visited);
	}

	// Driver Code
	public static void main(String args[])
	{
		DepthFirst g = new DepthFirst(7);

		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(2, 5);
		g.addEdge(4, 5);
		g.addEdge(4, 6);
        g.addEdge(5, 6);

		System.out.println(
			"Following is Depth First Traversal "
			+ "(starting from vertex 2)");

		g.DFS(1);
	}
}
// This code is contributed by Aakash Hasija
