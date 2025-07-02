class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int j=1,curr=nums[0];
        while(j<nums.length){
            if(curr < 0){
                // max = max - nums[i];
                curr = 0;
            }
            curr +=nums[j];
            
            max = Math.max(curr,max);
            j++;
        }
        return max;
        
    }
}