class Solution {
    public int maxScore(int[] nums, int k) {
        int totalSum = 0;
        int minSum = Integer.MAX_VALUE;
        int n = nums.length;
        int window = n - k;
        int count = 0;
        
        for (int num : nums) {
            totalSum += num;
        }
      
        int windowSum = 0;
        for (int i = 0; i < window; i++) {
            windowSum += nums[i];
        }
       minSum = Math.min(minSum, windowSum);
        
        
        for (int end = window; end < n; end++) {
            windowSum += nums[end] - nums[end - window];
            minSum = Math.min(minSum, windowSum);
        }
        
        
        return totalSum - minSum;
    }
}
