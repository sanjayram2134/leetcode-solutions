class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix[] = new int[nums.length];
        int suffix[] = new int[nums.length];
        int l = nums.length;
        int pro = 1;
        for(int i=0;i<l;i++)
        {
            prefix[i] = pro;
            pro*=nums[i];
        }
        pro = 1;
        for(int i=l-1;i>=0;i--)
        {
            suffix[i] = pro;
            pro*=nums[i];
        }
        int ans[] = new int[l];
        for(int i=0;i<l;i++)
        {
            ans[i] = prefix[i]*suffix[i];
        }
        return ans;
    }
}