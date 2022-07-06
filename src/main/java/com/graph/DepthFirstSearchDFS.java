package com.graph;

public class DepthFirstSearchDFS {
  public static void dfs(int[][] graph) {
    int n = graph.length;
    boolean[] visited = new boolean[n];
    for (int i = 0; i < n; i++) {
      visited[i] = false;
    }

    for (int i = 0; i < n; i++) {
      if (!visited[i]) {
        visitNode(visited, graph, i);
      }
    }
  }

  private static void visitNode(boolean[] visited, int[][] graph, int i) {
    visited[i] = true;
    System.out.print(i + " -> ");
    for (int j = 0; j < graph.length; j++) {
      if (graph[i][j] != 0)
        if (!visited[j]) {
          visitNode(visited, graph, j);
        }
    }
  }
}
