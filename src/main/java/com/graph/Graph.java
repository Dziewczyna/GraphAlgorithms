package com.graph;

public class Graph {

    /**
     *                          (4)
     *               ,-------1------7
     *           (6) |       |(9)  /
     *               |       |   / (2)
     *          (3)  |  (1)  | /
     *       5 ----- 3 ----- 2
     *       |       |       |
     *       |       | (4)   | (7)
     *       |       |       |
     *       '-----  4 ----- 6
     *     (7)         (8)
     *
     */
    public static int[][] notDirectedGraph(){
        int n = 7;
        int[][] graph = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                graph[i][j] = 0;
            }
        }
        graph[0][1] = 9;
        graph[0][2] = 6;
        graph[0][6] = 4;
        graph[1][0] = 9;
        graph[1][2] = 1;
        graph[1][5] = 7;
        graph[1][6] = 2;
        graph[2][0] = 6;
        graph[2][1] = 1;
        graph[2][3] = 4;
        graph[2][4] = 3;
        graph[3][2] = 4;
        graph[3][4] = 7;
        graph[3][5] = 8;
        graph[4][2] = 3;
        graph[4][3] = 7;
        graph[5][1] = 7;
        graph[5][3] = 8;
        graph[6][0] = 4;
        graph[6][1] = 2;

        return graph;
    }

    /**
     *             (6)           (5)
     *       0 ----------> 1 <--------- 2
     *       ^             |          /
     *       |             |        /
     *       |         (9) |      / (1)
     *       |              \   /
     *   (12) |               \/
     *       |               |
     *       |               |
     *       |               v
     *       4 <------------ 3
     *              (45)
     */
    public static int[][] directedGraph(){
        int n = 5;
        int[][] graph = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                graph[i][j] = 0;
            }
        }
        graph[0][1]=6;
        graph[1][3]=9;
        graph[2][1]=5;
        graph[2][3]=1;
        graph[3][4]=45;
        graph[4][0]=12;

        return graph;
    }

    /**
     *                  0
     *               /     \
     *             /        \
     *           /           \
     *         /              \
     *       1                2
     *     /   \            /  \
     *    3     4         5      6
     *   / \   /  \     / \     / \
     *  7  8  9   10  11  12  13  14
     *
     *
     **/

    public static int[][] tree(){
        int n = 15;
        int[][] graph = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                graph[i][j] = 0;
            }
        }
        graph[0][1] = 1;
        graph[0][2] = 1;
        graph[1][0] = 1;
        graph[1][3] = 1;
        graph[1][4] = 1;
        graph[2][0] = 1;
        graph[2][5] = 1;
        graph[2][6] = 1;
        graph[3][1] = 1;
        graph[3][7] = 1;
        graph[3][8] = 1;
        graph[4][1] = 1;
        graph[4][9] = 1;
        graph[4][10] = 1;
        graph[7][3] = 1;
        graph[8][3] = 1;
        graph[9][4] = 1;
        graph[10][4] = 1;
        graph[5][2] = 1;
        graph[5][11] = 1;
        graph[5][12] = 1;
        graph[6][2] = 1;
        graph[6][13] = 1;
        graph[6][14] = 1;
        graph[11][5] = 1;
        graph[12][5] = 1;
        graph[13][6] = 1;
        graph[14][6] = 1;
        return graph;
    }

    public static void printGraph(int[][] graph){
        for (int[] row : graph) {
            for (int value : row) {
                System.out.print("["+value+"] ");
            }
            System.out.println();
        }
    }

}
