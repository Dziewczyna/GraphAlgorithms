package com.graph;

public class Main {
  public static void main(String[] args) {
    int[][] graph = Graph.notDirectedGraph();

    Graph.directedGraph();
    Graph.printGraph(graph);

    System.out.println("\n\n BFS");
    BreadthFirstSearchBFS.bfs(graph);

    System.out.println("\n\n DFS");
    DepthFirstSearchDFS.dfs(graph);

    System.out.println("\n\n Dijkstra's shortest path");
    DijkstrasShortestPathAlgorithm.dijkstra(graph);
  }
}
