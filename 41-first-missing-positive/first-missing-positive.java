class Solution {
    public int firstMissingPositive(int[] nums) {
        int l = nums.length;
        boolean ans[] = new boolean[l+1];
        for(int i=0;i<l;i++)
        {
            if(nums[i]>0 && nums[i]<=l)
            {
                ans[nums[i]] = true;
            }
        }
        for(int i=1;i<=l;i++)
        {
            if(!ans[i])
            {
                return i;
            }
        }
        return l+1;
    }
}