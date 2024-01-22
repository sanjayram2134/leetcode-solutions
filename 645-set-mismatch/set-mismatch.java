class Solution {
    public int[] findErrorNums(int[] nums) {
        int ans[] = new int[2];
       
        int n = nums.length;
        for(int i=1;i<=n;i++)
        {
            int c = 0;
            for(int j = 0;j<n;j++)
            {
                if(nums[j]==i)
                {
                    c++;
                }
            }
            if(c==2)
            {
                ans[0] = i;
            }
            if(c==0)
            {
                ans[1] = i;
            }

        }
        
        return ans;
    }
}