class Solution {
    public boolean canPartition(int[] nums) {
        int total = 0;
        int n = nums.length;
        for(int i:nums)
        {
            total+=i;
        }
        if(total%2==1)
        {
            return false;
        }
        int subsetsum = total/2;
        return subsetSumToK(n,subsetsum,nums);

    } 
    static boolean subsetSumToK(int n, int k, int[] arr) {
       
        boolean dp[][] = new boolean[n][k + 1];
        
       
        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }

       
        if (arr[0] <= k) {
            dp[0][arr[0]] = true;
        }

        // Fill in the DP table using bottom-up approach
        for (int ind = 1; ind < n; ind++) {
            for (int target = 1; target <= k; target++) {
 
                boolean notTaken = dp[ind - 1][target];
                

                boolean taken = false;
                if (arr[ind] <= target) {
                    taken = dp[ind - 1][target - arr[ind]];
                }
                
                // Store the result in the DP table
                dp[ind][target] = notTaken || taken;
            }
        }

        // The final result is stored in the bottom-right cell of the DP table
        return dp[n - 1][k];
    }
}