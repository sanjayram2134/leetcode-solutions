
class Node {
    int first;
    int second;
    int third;

    Node(int _first, int _second, int _third) {
        this.first = _first;
        this.second = _second;
        this.third = _third;
    }
}

class Solution {
    public int[][] updateMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int[][] dist = new int[n][m];
        
        // Initialize the queue
        Queue<Node> q = new LinkedList<>();

        // Traverse the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0) {
                    q.add(new Node(i, j, 0));
                    vis[i][j] = 1;
                } else {
                    vis[i][j] = 0;
                }
            }
        }

        // Direction vectors for moving in the matrix
        int[] delrow = {-1, 0, 1, 0};
        int[] delcol = {0, 1, 0, -1};

        // Perform BFS
        while (!q.isEmpty()) {
            int row = q.peek().first;
            int col = q.peek().second;
            int steps = q.peek().third;
            q.remove();
            dist[row][col] = steps;

            // Check all 4 possible directions
            for (int i = 0; i < 4; i++) {
                int nrow = row + delrow[i];
                int ncol = col + delcol[i];

                // Check for valid unvisited cell
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0) {
                    vis[nrow][ncol] = 1;
                    q.add(new Node(nrow, ncol, steps + 1));
                }
            }
        }

        // Return the distance matrix
        return dist;
    }
}