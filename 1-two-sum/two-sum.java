class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> ans  = new HashMap<>();
        int l = nums.length;
        for(int i=0;i<l;i++)
        {
           ans.put(nums[i],i);

        }
        for(int i=0;i<l;i++)
        {
            int bal  = target-nums[i];
            if(ans.containsKey(bal) && ans.get(bal)!=i)
            {
                return new int[] { i, ans.get(bal) };
            }
        }
        return null;
    }
}
