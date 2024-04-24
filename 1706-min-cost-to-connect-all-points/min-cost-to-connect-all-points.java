class Solution {
    public class Pair {
        int v;
        int wt;

        Pair(int v, int wt) {
            this.v = v;
            this.wt = wt;
        }
    }

    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int x1 = points[i][0];
                int y1 = points[i][1];

                int x2 = points[j][0];
                int y2 = points[j][1];

                int dist = Math.abs(x1 - x2) + Math.abs(y1 - y2); // Manhattan distance
                adj.get(i).add(new Pair(j, dist));
                adj.get(j).add(new Pair(i, dist));
            }
        }

        boolean[] visited = new boolean[n];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->(a.wt - b.wt));
        int ans = 0;
        pq.add(new Pair(0, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            if (visited[curr.v])
                continue;

            ans += curr.wt;
            visited[curr.v] = true;

            ArrayList<Pair> nbr = adj.get(curr.v);

            for (Pair next : nbr) {
                if (!visited[next.v]) {
                    pq.add(new Pair(next.v, next.wt));
                }
            }
        }
        return ans;
    }
}