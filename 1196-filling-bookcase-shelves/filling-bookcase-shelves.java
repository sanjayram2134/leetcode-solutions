public class Solution {
        public int minHeightShelves(int[][] books, int shelfWidth) {
        int n = books.length;
        int[] dp = new int[n + 1];
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            int currentWidth = 0;
            int currentHeight = 0;
            dp[i] = Integer.MAX_VALUE;
            for (int j = i; j > 0; j--) {
                currentWidth += books[j - 1][0];
                if (currentWidth > shelfWidth) {
                    break;
                }
                currentHeight = Math.max(currentHeight, books[j - 1][1]);
                dp[i] = Math.min(dp[i], dp[j - 1] + currentHeight);
            }
        }

        return dp[n];
    }
   
}
