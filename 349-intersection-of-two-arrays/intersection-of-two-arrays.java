class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        Set<Integer> s1 = new HashSet<Integer>(); 
          Set<Integer> s2 = new HashSet<Integer>();

          for(int z:nums1)
          {
              s1.add(z);
          }
          
          for(int z:nums2)
          {
              s2.add(z);
          }

          for(int z:s1)
          {
              if(s2.contains(z))
              {
                  a.add(z);
              }
          }
          int l = a.size();
          int arr[] = new int[l];
          for(int i=0;i<l;i++)
          {
                   arr[i] = a.get(i);
          }
          return arr;


    }
}