class Solution {
    public int maxArea(int[] height) {
        int l = height.length;
        int max1 = 0;
        int i =0;
        int j = l-1;
        while(i<j)
        { 
                int area = (j-i)*Math.min(height[j],height[i]);
                max1= Math.max(max1,area);
                if(height[i]<height[j])
                {
                    i++;
                }
                else
                {
                    j--;
                }
            
        }
    return max1;
    }
}