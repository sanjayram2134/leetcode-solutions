class Solution {
    public int singleNumber(int[] nums) {
        int l = nums.length;
        int ans = 0;
        for(int i=0;i<l;i++)
        {
            ans = ans ^ nums[i];
        }
        return ans;
//bitwise method
//a^a = 0
    }
}