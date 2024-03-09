class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<Integer>();    
      for(int i=0;i<nums1.length;i++)
      {
          set1.add(nums1[i]);
      }

        for(int i=0;i<nums2.length;i++)
        {
            if(set1.contains(nums2[i]))
            {
                return nums2[i];
            }
        }
        return -1;
    }
}