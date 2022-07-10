package com.graph;

public class DijkstrasShortestPathAlgorithm {
  public static void dijkstra(int[][] graph){
    int firstVertex = 0;
    int vertexCount = graph.length;
    boolean[] visitedVertex = new boolean[vertexCount];
    int[] dist = new int[vertexCount];
    for (int i = 0; i < vertexCount; i++){
      visitedVertex[i] = false;
      dist[i] = Integer.MAX_VALUE;
    }
    dist[firstVertex] = 0;
    for (int i = 0; i < vertexCount; i++){
      int u = findMinDistance(dist, visitedVertex);
      visitedVertex[u] = true;
      for (int v =0 ; v < vertexCount; v++){
        if(!visitedVertex[v] && graph[u][v] != 0 && (dist[u] + graph[u][v] < dist[v])){
          dist[v] = dist[u] + graph[u][v];
        }
      }
    }
    for (int i = 0; i < dist.length; i++){
      System.out.println(String.format("From vertex %s to vertex %s is %s", firstVertex, i, dist[i]));
    }

  }

  private static int findMinDistance(int[] dist, boolean[] visitedVertex) {
    int minDistance = Integer.MAX_VALUE;
    int minDistanceVertex = -1;
    for (int i =0; i < dist.length; i++){
      if(!visitedVertex[i] && dist[i] < minDistance){
        minDistance = dist[i];
        minDistanceVertex = i;
      }
    }
    return minDistanceVertex;
  }
}