class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> cumulativeSumCount = new HashMap<>();
        cumulativeSumCount.put(0, 1);
        int cumulativeSum = 0;
        int count = 0;

        for (int num : nums) {
            cumulativeSum += num;
            int difference = cumulativeSum - k;
            if (cumulativeSumCount.containsKey(difference)) {
                count += cumulativeSumCount.get(difference);
            }
            cumulativeSumCount.put(cumulativeSum, cumulativeSumCount.getOrDefault(cumulativeSum, 0) + 1);
        }

        return count;
    }
}