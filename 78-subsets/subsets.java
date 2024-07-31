class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int l = nums.length;
        int nos = 1<<l;
        for(int i=0;i<nos;i++)
        {
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<l;j++)
            {
                int z  = 1<<j;
                if((i&z)!=0)
                {
                    list.add(nums[j]);
                }
            }
            ans.add(list);
        }
        return ans;
    }
}