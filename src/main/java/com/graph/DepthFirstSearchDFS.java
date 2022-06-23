package com.graph;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class DepthFirstSearchDFS {
  private static LinkedList<Integer> adjLists[];
  private static boolean visited[];

  DepthFirstSearchDFS(int vertices) {
    adjLists = new LinkedList[vertices];
    visited = new boolean[vertices];

    for (int i = 0; i < vertices; i++){
      visited[i] = false;
    }

    for (int i = 0; i < vertices; i++)
      adjLists[i] = new LinkedList<Integer>();
  }

  void addEdge(int src, int dest) {
    adjLists[src].add(dest);
  }

  public static void dfs(int[][] graph) {
    int vertex = graph.length;
    visited[vertex] = true;
    System.out.print(vertex + " ");

    Iterator<Integer> ite = adjLists[vertex].listIterator();
    while (ite.hasNext()) {
      int adj = ite.next();
      if (!visited[adj])
        visitNode(visited, graph, adj);
    }
  }

  private static void visitNode(boolean[] visited, int[][]graph, int i) {
    visited[i] = true;
    System.out.print("vertex " + i +" - ");
    for (int v = 0; v < visited.length; v++){
      if (graph[i][v] != 0){
        if (!visited[v]){
          visitNode(visited, graph, v);
        }
      }
    }
  }
}
