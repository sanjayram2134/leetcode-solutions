class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int l = nums.length;
        int i = 1;
        while(i<l)
        {
        if(nums[i]==nums[i-1])
        {
            ans.add(nums[i]);
        }
             i++;
        }
        return ans;
    }
}