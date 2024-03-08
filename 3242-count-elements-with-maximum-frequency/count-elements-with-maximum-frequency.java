class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> ans = new HashMap<>();
        for(int i:nums)
        {
            ans.put(i,ans.getOrDefault(i,0)+1);
        }
        int max = 0;
        for(int i:ans.values())
        {
            max = Math.max(i,max);
        }
        int count = 0;
        for(int i:ans.values())
        {
            if(i==max)
            {
                count++;
            }
        }
        return count*max;

    }
}