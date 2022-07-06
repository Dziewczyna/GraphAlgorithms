package com.graph;

public class Main {
  public static void main(String[] args) {
    int[][] graph = Graph.notDirectedGraph();

    Graph.directedGraph();
    Graph.printGraph(graph);

    System.out.println("\n BFS");
    BreadthFirstSearchBFS.bfs(graph);

    System.out.println("\n DFS");
    DepthFirstSearchDFS.dfs(graph);
  }
}
