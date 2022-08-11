package com.graph;

public class MinimumSpanningTree_Prim {
    public static int GRAPH_SIZE;

    static void printMst(int[] parent, int[][] graph)
    {
        System.out.println("Edge  ---> Weight");
        for (int i = 1; i < GRAPH_SIZE; i++)
            System.out.println(parent[i] + " - " + i + "--->" + graph[i][parent[i]]);
    }

    public static void minSpanningTreePrim(int[][] graph)
    {
        GRAPH_SIZE = graph.length;
        int[] mst = new int[GRAPH_SIZE];
        int[] minWeightEdge = new int[GRAPH_SIZE];
        Boolean[] mstVertices = new Boolean[GRAPH_SIZE];

        for (int i = 0; i < GRAPH_SIZE; i++) {
            minWeightEdge[i] = Integer.MAX_VALUE;
            mstVertices[i] = false;
        }

        minWeightEdge[0] = 0;
        mst[0] = -1;

        for (int count = 0; count < GRAPH_SIZE - 1; count++) {
            int u = minIndex(minWeightEdge, mstVertices);
            mstVertices[u] = true;
            for (int v = 0; v < GRAPH_SIZE; v++)
                if (graph[u][v] != 0 && !mstVertices[v] && graph[u][v] < minWeightEdge[v]) {
                    mst[v] = u;
                    minWeightEdge[v] = graph[u][v];
                }
        }
        printMst(mst, graph);
}
    static int minIndex(int[] minWeightEdge, Boolean[] mstSet)
    {
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < GRAPH_SIZE; v++)
            if (!mstSet[v] && minWeightEdge[v] < min) {
                min = minWeightEdge[v];
                min_index = v;
            }
        return min_index;
    }
}
