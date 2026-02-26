package org.aniket.graph;

public class GraphMatrix 
{
	private int vertices;
	private int matrix[][];
	
	GraphMatrix(int vertices)
	{
		this.vertices = vertices;
		matrix = new int[vertices][vertices];
	}
	
	public void addEdge(int source, int destination)
	{
		matrix[source][destination] = 1;
		matrix[destination][source] = 1;
	}
	
	public void removeEdge(int source, int destination)
	{
		matrix[source][destination] = 0;
		matrix[destination][source] = 0;
	}
	
	public void printGraph()
	{
		System.out.println("Adjacency Matrix:");
		for(int i = 0; i < matrix.length; i++)
		{
			for(int j = 0; j < matrix[0].length; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
