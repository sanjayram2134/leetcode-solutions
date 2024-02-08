class Solution {
    public int trap(int[] height) {
        int l= height.length;
      int leftmax[] = new int[l];
      int rightmax[] = new int[l];
      leftmax[0] = height[0];
      rightmax[l-1] = height[l-1];
      for(int i=1;i<l;i++)
      {
          leftmax[i] = Math.max(height[i],leftmax[i-1]);
      } 
      for(int i=l-2;i>=0;i--)
      {
          rightmax[i] = Math.max(height[i],rightmax[i+1]);
      }
      int sum = 0;
      for(int i=0;i<l;i++)
      {
              int level = Math.min(leftmax[i],rightmax[i]);
              sum+= level-height[i];
      }
      return sum; 
    }
}