
public class Main extends GraphFactory{

	public static void main(String[] args) {
		Digraph g= createDiGraphFromTextFile("Graph/graph-DFS-BFS.txt");
		//System.out.println(g.isConnected());
		System.out.println(Graph.cc(g));
		
		//test de la class BFSShortestPaths
		// on suppose que les sommets sont numéroté de 1 jusqu'a n
		boolean[] marked = new boolean[g.vertices().size()];
		int [] previous = new int [g.vertices().size()];
		int [] distance = new int [g.vertices().size()];
		BFSShortestPaths bfsSp = new BFSShortestPaths(marked, previous, distance);
		bfsSp.bfs(g, 1);
		for (int i =0;i<g.vertices().size(); i++) {
			System.out.println("distance du point:"+ (i+1) + " par raport a l'origine= " + bfsSp.getDistance()[i] +" ");
		}
		
		System.out.println("");
		System.out.println("le point: " + 11 + " a-t-il un chemin vers s ? " + bfsSp.hasPathTo(11));
		System.out.println("");

		System.out.println("distance du point:" + 5 + " par rapport a lorigine= "+ bfsSp.distTo(5));
		System.out.println("");
		
		System.out.println("plus court chemin entre s et " + 7);
		System.out.println("");
		bfsSp.printSP(7);
		System.out.println("");

		System.out.println("representation du digraph a partir du fichier graph-WDG");
		WDgraph wdg = createWDGraphFromTextFile("Graph/graph-WDG.txt");
		for (int i =0;i<wdg.getAdjacencyList().size(); i++) {
			System.out.print(wdg.getAdjacencyList().get(i).from());
			System.out.print(" " + wdg.getAdjacencyList().get(i).to());
			System.out.print(" " + wdg.getAdjacencyList().get(i).weight());
			System.out.println("");
		}
	}

}
