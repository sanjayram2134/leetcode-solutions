class Solution {
    public int longestConsecutive(int[] nums) {
        int l = nums.length;
        if(l==0)
        {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int longest = Integer.MIN_VALUE;
        for(int i:set)
        {
            if(!set.contains(i-1))
            {
                int curr_len = 1;
                int x = i;
                while(set.contains(x+1))
                {
                    x = x+1;
                    curr_len++;
                }
                longest = Math.max(longest,curr_len);
            }

        }
        return longest;
    }
}