class Solution {
    public int[] rearrangeArray(int[] nums) {
        int l = nums.length;
        int ans[] = new int[l];
        int z1[] = new int[l/2];
        int z2[] = new int[l/2];
        int i=0,j=0;
        for(int z:nums)
        {
            if(z>=0)
            {
               z1[i] = z;
               i++;
            }else
            {
                z2[j] = z;
                j++;

            }
        }
        int k =0;
        for(int in=0;in<l;in+=2){
               ans[in] = z1[k];
               ans[in+1] = z2[k];
               k++;
        }
        return ans;

    }
}