class Solution {
    public int[] rearrangeArray(int[] nums) {
        int l = nums.length;
        int posind = 0,negind=1;
        int ans[] = new int[l];
        for(int i=0;i<l;i++)
        {
            if(nums[i]>0)
            {
                ans[posind] = nums[i];
                posind+=2;
            }
            else
            {
                ans[negind] = nums[i];
                negind+=2;
            }
        }
        return ans;
    }
}