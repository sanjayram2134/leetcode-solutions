class Solution {
    public long largestPerimeter(int[] nums) {
        int l = nums.length;
        if(l<=2)
        {
            return 0;
        }
        Arrays.sort(nums);
        long total   = 0;
        for(int i :nums)
        {
            total+=i;
        }
        for(int i=l-1;i>=2;i--)
        {
            if(total-nums[i]>nums[i])
            {
                return total;
            }
            else
            {
                total-=nums[i];
            }
        }
        return -1;
    }
}