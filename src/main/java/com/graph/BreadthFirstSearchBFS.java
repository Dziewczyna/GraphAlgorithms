package com.graph;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearchBFS {
  private static int graphSize;
  private static LinkedList<Integer>[] adj;

  public static void bfs(int[][] graph) {
    graphSize = graph.length;
    boolean[] visited = new boolean[graphSize];

    Queue<Integer> queue = new ArrayDeque<>();

    int firstVertex = 0;
    queue.offer(firstVertex);

    while (!queue.isEmpty()) {
      int used = queue.poll();
      for (int i = 0; i < graphSize; i++) {
        if (graph[used][i] != 0) {
          if (!visited[i]) {
            queue.offer(i);
          }
        }
      }
      visited[used] = true;
      System.out.print(used + " -> ");
    }
  }
}
