package org.aniket.graph;


public class GraphImplementation {

	public static void main(String[] args) 
	{
		GraphMatrix graph = new GraphMatrix(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);

        graph.printGraph();
       
        GraphList list = new GraphList(4);
        list.addEdge(0, 1);
        list.addEdge(0, 2);
        list.addEdge(1, 3);
        
        list.printEdge();
	}

}
