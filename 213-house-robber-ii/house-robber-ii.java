class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n<=1)
        {
            return nums[0];
        }
        return solve(nums,n);

    }
    public int solve(int []nums,int n)
    {
        int arr1[] = new int[n-1];
        int arr2[] = new int[n-1];
        for(int i=0;i<n-1;i++)
        {
            arr1[i] = nums[i];
        }
        for(int i=1;i<n;i++)
        {
            arr2[i-1] = nums[i];
        }
        int ans1 = robi(arr1);
        int ans2 = robi(arr2);
        return Math.max(ans1,ans2);
    }
    public int robi(int[] arr)
    {
        int n = arr.length;
        int dp[] = new int[n];
        dp[0] = arr[0];
        for(int i=1;i<n;i++)
        {
            int p = arr[i];
            int np = dp[i-1];
            if(i>1)
            {
                p+=dp[i-2];
            }
            dp[i] = Math.max(p,np);
        }
        return dp[n-1];
    }
}