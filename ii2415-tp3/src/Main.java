
public class Main extends GraphFactory{

	public static void main(String[] args) {
		Digraph g= createDiGraphFromTextFile("Graph/graph-DFS-BFS.txt");
		//System.out.println(g.isConnected());
		System.out.println(Graph.cc(g));
		 
		WDgraph wdg = createWDGraphFromTextFile("Graph/graph-WDG.txt");
		for (int i =0;i<wdg.getAdjacencyList().size(); i++) {
			System.out.print(wdg.getAdjacencyList().get(i).from());
			System.out.print(" " + wdg.getAdjacencyList().get(i).to());
			System.out.print(" " + wdg.getAdjacencyList().get(i).weight());
			System.out.println("");
		}
	}

}
