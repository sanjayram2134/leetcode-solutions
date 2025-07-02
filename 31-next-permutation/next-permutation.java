class Solution {
    public void nextPermutation(int[] nums) {
        int l = nums.length;
        if(l==1)
        {
            return;
        }
        int lastindex= -1;
        for(int i=1;i<l;i++)
        {
            if(nums[i]>nums[i-1])
            {
                lastindex = i;
            }
        }
        if(lastindex==-1)
        {
            Arrays.sort(nums);
            return;
        }
        int index= lastindex;
        for(int i= lastindex;i<l;i++)
        {
            if(nums[i]>nums[lastindex-1] && nums[i]<nums[index])
            {
                index = i;
            }
        }
       // swap(nums[lastindex-1],nums[index]);
        int temp = nums[lastindex-1];
        nums[lastindex-1]=nums[index];
        nums[index]=temp;
        Arrays.sort(nums, lastindex, l);
    }
   

}