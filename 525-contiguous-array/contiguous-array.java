class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int l = nums.length;
        int count = 0,max = 0;
        for(int i=0;i<l;i++)
        {
            count+= nums[i]==1?1:-1;
            if(count==0)
            {
                max = Math.max(max,i+1);
            }
            if(map.containsKey(count))
            {
                max = Math.max(max , i-map.get(count));
            }
            else
            {
                map.put(count,i);
            }
        }
        return max;
    }
}