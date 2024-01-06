class Solution {
    public void sortColors(int[] nums) {
        int l = nums.length;
        int low = 0;
        int  high = l-1;
        int index = 0;
        while(index<=high)
        {
            if(nums[index]==0)
            {
                  swap(nums,low,index);
                  low++;
                  index++;
            }
            else if(nums[index]==1)
            {
                index++;
            }
            else
            {
                swap(nums,index,high);
                high--;
                //index++;
            }
        }
    }
    public static void swap(int a[],int  i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    {

    }
}