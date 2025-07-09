class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int count = 1;
        int maxLen = 1;
        int i = 1;
        int curr = nums[0];

        while (i < nums.length) {
            if (nums[i] == curr) {
                i++;
                continue;
            } else if (nums[i] == curr + 1) {
                count++;
            } else {
                count = 1;
            }
            curr = nums[i];
            maxLen = Math.max(maxLen, count);
            i++;
        }
        return maxLen;
    }
}
