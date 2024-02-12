class Solution {
    public int majorityElement(int[] nums) {
        int l = nums.length;
        int count = 0;;
        int max = nums[0];
        for(int i=0;i<l;i++)
        {
            if(nums[i]==max)
            {
                count++;
            }
            else
            {
                count--;
            }
            if(count==0)
            {
                max = nums[i];
                count = 1;
            }
        }
        return max;
    }
}
// TIME COMPLEXITY : O(n);
//SPACE COMPLEXITY : O(1);