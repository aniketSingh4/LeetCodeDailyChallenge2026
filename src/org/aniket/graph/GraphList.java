package org.aniket.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphList 
{
	private int vertices;
	private List<List<Integer>> adjList;
	
	GraphList(int vertices)
	{
		this.vertices = vertices;
		adjList = new ArrayList<>();
		
		for(int i = 0; i < vertices; i++)
		{
			adjList.add(new ArrayList<>());
		}
	}
	
	public void addEdge(int source, int destination)
	{
		adjList.get(source).add(destination);
		adjList.get(destination).add(source);
	}
	
	public void removeEdge(int source, int destination)
	{
		adjList.get(source).remove(destination);
		adjList.get(destination).remove(source);
	}
	
	public void printEdge()
	{
		System.out.println("Adjacency List:");
		
		for(int i = 0; i < vertices; i++)
		{
			System.out.print(i + " -> ");
            for (int neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
		}
	}

}
