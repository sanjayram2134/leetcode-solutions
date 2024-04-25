class Solution {
    int[] par; // parent array to store the parent of each node
    int[] rank; // rank array to store the rank of each node

    public int find(int x) {
        if (par[x] == x) {
            return x;
        }
        int temp = find(par[x]);
        par[x] = temp;
        return temp;
    }

    public void union(int x, int y) {
        int lx = find(x);
        int ly = find(y);
        if (lx != ly) {
            if (rank[lx] > rank[ly]) {
                par[ly] = lx;
            } else if (rank[ly] > rank[lx]) {
                par[lx] = ly;
            } else {
                par[lx] = ly;
                rank[ly]++;
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        par = new int[n];
        rank = new int[n];
        
        // Initialize parent array and rank array
        for (int i = 0; i < n; i++) {
            par[i] = i; // each node is initially its own parent
            rank[i] = 1; // initial rank is 0
        }

        // Union connected nodes
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1 && i!=j) {
                    union(i, j); // union connected nodes
                }
            }
        }

        // Count the number of unique parents
        int circles = 0;
        for (int i = 0; i < n; i++) {
            if (par[i] == i) { // if node is its own parent
                circles++; // increment count of circles
            }
        }

        return circles;
    }
}