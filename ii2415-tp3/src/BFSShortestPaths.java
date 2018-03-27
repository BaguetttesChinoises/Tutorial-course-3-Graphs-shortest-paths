import java.util.ArrayList;
import java.util.List;

public class BFSShortestPaths {
	private boolean[] marked;
	private int[] previous;
	private int[] distance;
	
	
	public BFSShortestPaths(boolean[] marked, int[] previous, int[] distance) {
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
		this.distance[s-1] = 0;
		List<Integer> queue = new ArrayList<Integer>();
		queue.add(s);
		marked[s-1]=true;
		while (queue.size() != 0) {
			// Dequeue
			int x = queue.get(queue.size()-1);
			queue.remove(queue.size()-1);
			List<Integer> voisins=g.outNeighbors(x);
			// for each vertex Y adjacent to X
			for (int y : voisins) {
				if (marked[y-1] != true) {
					marked[y-1] = true;
					previous[y-1] = x;
					distance[y-1] = distance[x-1] +1;
					queue.add(y);
				}
			}
		}
		// on initializes les points qui sont a lexterieur du graph a 
		// une distance de graph.length +1 pour repr�senter une distance infini
		for (int i=0;i<distance.length;i++) {
			if (i!=s-1 && distance[i]==0) {
				distance[i]= distance.length+1;
			}
		}
		
	}
	
	public boolean hasPathTo (int v) {
		int u = v;
		// on suppose qu'une distance infini (le sommet est en dehors du graph) correspond 
		//� une distance de taille = graphe.length +1
		if(v<=distance.length) {
			while (distance[u-1] != 0 || (distance[u-1] != distance.length +1)) {
				// permet deviter un out of range
				if (previous[u-1] ==0) {
					break;
				}
				//on regarde le sommet precedent
				u = previous[u-1];
			}
			if (distance[u-1] == 0) {
				return true;
			}
		}
		return false;
	}
	
	public int distTo(int v) {
		if (hasPathTo(v)) {
			return distance[v-1];
		}
		else {
			return distance.length +1;
		}
	}
	
	public void printSP(int v) {
		if (hasPathTo(v)) {
			int u = v;
			System.out.print(u);
			while (distance[u-1] != 0) {
				// permet deviter un out of range
				if (previous[u-1] ==0) {
					break;
				}
				u = previous[u-1];
				System.out.print(" <-> " + u);
			}
			System.out.println("");

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
