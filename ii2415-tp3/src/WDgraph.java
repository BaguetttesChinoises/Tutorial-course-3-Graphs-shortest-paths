import java.util.ArrayList;
import java.util.List;
public class WDgraph {
	private List <DirectedEdge> adjacencyList = new ArrayList<DirectedEdge>();;

	public WDgraph() {
	}
	
	public void addDirectedEdge(DirectedEdge directedEdge) {
		this.adjacencyList.add(directedEdge);
		}

	public List<DirectedEdge> getAdjacencyList() {
		return adjacencyList;
	}

	public void setAdjacencyList(List<DirectedEdge> adjacencyList) {
		this.adjacencyList = adjacencyList;
	}
	
	
	
	
}
