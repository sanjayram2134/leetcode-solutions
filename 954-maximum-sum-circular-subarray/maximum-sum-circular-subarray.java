class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int l = nums.length;
        int sum  = 0,psum =0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<l;i++)
        {
            sum+=nums[i];
            max = Math.max(max,sum);
            
            if(sum<0)
            {
                sum=0;
            }
        }
        for(int i:nums)
        {
            psum+=i;
            sum+=i;
            min = Math.min(min,sum);
            if(sum>0)
            {
                sum = 0;
            }
        }
        if(psum==min)
        {
            return max;
        }
       
        else
        {
            return Math.max(max,psum-min);
        }


    }
}