class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length;
        for(int i=1;i<=l;i++)
        {
            if(nums[i]==nums[i-1])
            {
                return nums[i-1];
            }
        }
        return 0;
    }
}