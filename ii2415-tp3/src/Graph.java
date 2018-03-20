

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;


/**
 * This class is an Abstract Graph. 
 * Types of Vertices (V) and Edges (E) are not defined by default. 
 * The only constraints on theses types are that Vertices must be Comparable ie. 
 * there must be a way to order vertices with one another. This is done through the use of the Comparable interface.
 *  
 * 
 * @author slefebvr
 *
 * @param <V>
 * @param <E>
 */
public abstract class Graph<V extends Comparable<V>> {
	
	protected int nbVertices;
	protected int nbEdges;
	
	
	public Graph(int nbVertices, int nbEdges) {
		this.nbVertices= nbVertices;
		this.nbEdges = nbEdges;
	}
	
	
	/**
	 * Initializes an empty graph
	 */
	public Graph() {
		this(0,0);
	}
	
	public int order() {
		return nbVertices;
	}
	
	public int size() {
		return nbEdges;
	}

	/**
	 * Adds the corresponding vertex if needed
	 * @param e
	 */
	public abstract void addEdge(V s, V t);
	
	/**
	 * Adds a vertex to the graph. On success n is increased
	 * @param v
	 */
	public abstract void addVertex(V v);
	
	/**
	 * 
	 * @return the list of the graph vertices
	 */
	public abstract List<V> vertices();
		
	/** 
	 * Return the list of v's neighbors
	 * @param v
	 */
	public abstract List<V> inNeighbors(V v);
	public abstract List<V> outNeighbors(V v);
		
	/**
	 * Returns the inbound degree of node v
	 * in case of undirected graph should return the same as outDegree
	 * @param v
	 * @return inbound degree of vertex v
	 */
	public abstract int inDegree(V v);
	public abstract int outDegree(V v);
	
	
	
	/**
	 * Returns true if the graph is connected
	 * can be more efficient. 
	 * @return
	 */
	public boolean isConnected() {
		
	}
	
	/**
	 * Counts and returns the number of connected components
	 * @param g
	 * @return
	 */
	public static<V extends Comparable<V>> int cc(Graph<V> g) {
		
		
	}
	
	/**
	 * Returns the list of vertices ordered by DFS visit 
	 * 
	 * @param g
	 * @return
	 */
	public static<V extends Comparable<V>>  List<V> dfs(Graph<V> g) {
		
	}
	
	
	/**
	 * Iterative function for bfs 
	 * @param g
	 * @return
	 */
	public static<V extends Comparable<V>> List<V> bfs(Graph<V> g, V start) {
		
	}

}
