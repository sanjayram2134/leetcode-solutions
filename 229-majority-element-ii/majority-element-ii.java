class Solution {
    public List<Integer> majorityElement(int[] nums) {
       Map<Integer,Integer> ans = new HashMap<>();
    List<Integer> list  = new ArrayList<>();
        int l = nums.length;
        int z = l/3;
          for(int i:nums)
        {
            ans.put(i,ans.getOrDefault(i, 0) + 1);
        }
        int majorityElement = 0;
       

        for (Map.Entry<Integer, Integer> entry : ans.entrySet()) {
            if (entry.getValue() > z) {
                majorityElement = entry.getKey();
                list.add(majorityElement);
            }
        }

        return list;
    }
}