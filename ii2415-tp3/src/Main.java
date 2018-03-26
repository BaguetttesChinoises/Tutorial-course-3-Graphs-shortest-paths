
public class Main extends GraphFactory{

	public static void main(String[] args) {
		Digraph g= createDiGraphFromTextFile("Graph/graph-DFS-BFS.txt");
		//System.out.println(g.isConnected());
		 System.out.println(Graph.cc(g));
	}

}
