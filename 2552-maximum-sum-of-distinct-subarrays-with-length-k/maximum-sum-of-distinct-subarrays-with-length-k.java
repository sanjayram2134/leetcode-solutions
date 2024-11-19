class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int l = nums.length;
        long maxSum = 0; // To store the maximum sum
        long currentSum = 0; // To store the current sum of the sliding window
        HashSet<Integer> uniqueElements = new HashSet<>();

        int start = 0; // Start of the sliding window
        
        for (int end = 0; end < l; end++) {
            while (uniqueElements.contains(nums[end])) {
                currentSum -= nums[start];
                uniqueElements.remove(nums[start]);
                start++;
            }

            currentSum += nums[end];
            uniqueElements.add(nums[end]);

            if (end - start + 1 == k) { 
                maxSum = Math.max(maxSum, currentSum);

                currentSum -= nums[start];
                uniqueElements.remove(nums[start]);
                start++;
            }
        }
        return maxSum;
    }
}