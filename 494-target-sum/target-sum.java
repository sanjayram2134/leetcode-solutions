class Solution {
    static int mod= (int)Math.pow(10,9)+7;
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int total = 0;
        for(int i:nums)
        {
            total += i;
        }
        if(total - target < 0 || (total - target)%2 ==1)
        {
            return 0;
        }
        int sum = (total-target)/2;
        int dp[][] = new int[n][sum+1];
        if(nums[0]==0)
        {
            dp[0][0] = 2;
        }
        else
        {
            dp[0][0] = 1;
        }
        if(nums[0]<= sum && nums[0] !=0)
        {
            dp[0][nums[0]] = 1;
        }
        
        for(int i=1;i<n;i++)
        {
            for(int j = 0;j<=sum;j++)
            {
                int nottake = dp[i-1][j];
                int take = 0;
                if(nums[i]<=j)
                {
                    take = dp[i-1][j-nums[i]];
                }
                dp[i][j] = (take+nottake)%mod;
            }
        }
        return dp[n-1][sum];
    }
}