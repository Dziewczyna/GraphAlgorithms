package com.graph;

public class Main {
  public static void main(String[] args) {
      int[][] tree = Graph.tree();
      Graph.notDirectedGraph();
      Graph.directedGraph();
      Graph.printGraph(tree);

      System.out.println("\n BFS");
      BreadthFirstSearchBFS.bfs(tree);
  }
}
