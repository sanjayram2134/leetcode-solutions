class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int onesCount = 0;
        
        // Count the total number of 1's
        for (int num : nums) {
            if (num == 1) {
                onesCount++;
            }
        }
        
        // Handle edge case
        if (onesCount == 0 || onesCount == 1) {
            return 0;
        }
        
        // Extend the array to handle circular nature
        int[] extended = new int[2 * n];
        for (int i = 0; i < n; i++) {
            extended[i] = nums[i];
            extended[i + n] = nums[i];
        }
        
        // Find the maximum number of 1's in any window of size 'onesCount'
        int maxOnesInWindow = 0;
        int currentOnesInWindow = 0;
        
        for (int i = 0; i < 2 * n; i++) {
            if (i < onesCount) {
                if (extended[i] == 1) {
                    currentOnesInWindow++;
                }
            } else {
                if (extended[i] == 1) {
                    currentOnesInWindow++;
                }
                if (extended[i - onesCount] == 1) {
                    currentOnesInWindow--;
                }
            }
            if (i >= onesCount - 1) {
                maxOnesInWindow = Math.max(maxOnesInWindow, currentOnesInWindow);
            }
        }
        
        // Minimum swaps needed
        return onesCount - maxOnesInWindow;
    }
}
