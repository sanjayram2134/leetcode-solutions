class Solution {
    public int findJudge(int n, int[][] trust) {
        int trustcount[] = new int[n+1];
        int trustbycount[] = new int[n+1];
          for (int[] relation : trust) {
            int a = relation[0];
            int b = relation[1];
            trustcount[a]++;
            trustbycount[b]++;
        }
        for (int i = 1; i <= n; i++) {
            if (trustcount[i] == 0 && trustbycount[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }
}