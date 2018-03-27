import java.util.ArrayList;
import java.util.List;

public class BFSShortestPaths {
	private boolean[] marked;
	private int[] previous;
	private int[] distance;
	
	
	public BFSShortestPaths(boolean[] marked, int[] previous, int[] distance) {
		super();
		this.marked = marked;
		this.previous = previous;
		this.distance = distance;
	}


	/**
	 * Iterative function for (BFS) for shortest paths in unweighted (di)graphs
	 * @param g, s
	 * @return
	 */
	public <V extends Comparable<V>> void bfs(Digraph g, int s) {
		// List<Integer> sommets = g.vertices();
		this.distance[s] = 0;
		List<Integer> queue = new ArrayList<Integer>();
		queue.add(s);
		marked[s]=true;
		while (queue.size() != 0) {
			// Dequeue
			int x = queue.get(queue.size()-1);
			queue.remove(queue.size()-1);
			List<Integer> voisins=g.outNeighbors(x);
			// for each vertex Y adjacent to X
			for (int y : voisins) {
				if (marked[y] != true) {
					marked[y] = true;
					previous[y] = x;
					distance[y] = distance[x] +1;
					queue.add(y);
				}
			}
		}
		
	}
	
	public boolean hasPathTo (int v) {
		int u = v;
		// on suppose qu'une distance infini (le sommet est en dehors du graph) correspond 
		//à une distance de taille = graphe.length +1
		while (distance[u] != 0 || distance[u] != distance.length +1) {
			u = previous[u];
		}
		if (distance[u] == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int distTo(int v) {
		if (hasPathTo(v)) {
			return distance[v];
		}
		else {
			return distance.length +1;
		}
	}
	
	public void printSP(int v) {
		if (hasPathTo(v)) {
			int u = v;
			System.out.print(u);
			while (distance[u] != 0) {
				u = previous[u];
				System.out.print(" <-> " + u);
			}
		}
	}
	


	public boolean[] getMarked() {
		return marked;
	}


	public void setMarked(boolean[] marked) {
		this.marked = marked;
	}


	public int[] getPrevious() {
		return previous;
	}


	public void setPrevious(int[] previous) {
		this.previous = previous;
	}


	public int[] getDistance() {
		return distance;
	}


	public void setDistance(int[] distance) {
		this.distance = distance;
	}
	
	

}
