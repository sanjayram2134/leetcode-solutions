class Solution {
    private static final int MOD = 1000000007;
    public int rangeSum(int[] nums, int n, int left, int right) {
                List<Integer> subarraySums = new ArrayList<>();
        
        // Compute all subarray sums
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                subarraySums.add(sum);
            }
        }
        
        // Sort subarray sums
        Collections.sort(subarraySums);
        
        // Sum elements from index left-1 to right-1 (1-based to 0-based index)
        long totalSum = 0;
        for (int i = left - 1; i < right; i++) {
            totalSum = (totalSum + subarraySums.get(i)) % MOD;
        }
        
        return (int) totalSum;

    }
}