class Solution {
    public int find(int x, int[] parent) {
        if (parent[x] == x) {
            return x;
        }
        int temp = find(parent[x], parent);
        parent[x] = temp;
        return temp;
    }

    public  boolean union(int x, int y, int[] parent, int[] rank) {
        int lx = find(x, parent);
        int ly = find(y, parent);

        if (lx != ly) {
            if (rank[lx] >= rank[ly]) {
                parent[ly] = lx;
            } else if (rank[lx] < rank[ly]) {
                parent[lx] = ly;
            } else {
                parent[lx] = ly;
                rank[ly]++;
            }
            return true;
        }
        return false;
    }

    public int maxNumEdgesToRemove(int n, int[][] edges) {
        int[] parenta = new int[n + 1];
        int[] parentb = new int[n + 1];
        int[] ranka = new int[n + 1];
        int[] rankb = new int[n + 1];

        for (int i = 0; i < n; i++) {
            parenta[i] = i;
            parentb[i] = i;
            ranka[i] = 1;
            rankb[i] = 1;
        }

        Arrays.sort(edges, (a, b) -> Integer.compare(b[0], a[0]));

        int mergedA = 1;
        int mergedB = 1;

        int removedEdges = 0;

        for (int[] e : edges) {
            if (e[0] == 3) {
                boolean tempa = union(e[1], e[2], parenta, ranka);
                boolean tempb = union(e[1], e[2], parentb, rankb);

                if (tempa == true)
                    mergedA++;
                if (tempb == true)
                    mergedB++;

                if (!tempa && !tempb)
                    removedEdges++;

            } else if (e[0] == 1) {
                boolean tempa = union(e[1], e[2], parenta, ranka);

                if (tempa == true)
                    mergedA++;
                else
                    removedEdges++;
            } else {
                boolean tempb = union(e[1], e[2], parentb, rankb);

                if (tempb == true)
                    mergedB++;
                else
                    removedEdges++;
            }
        }
        if (mergedA != n || mergedB != n)
            return -1;

        return removedEdges;
    }
}