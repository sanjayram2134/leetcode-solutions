class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        
        while(start <= end) {
            int mid = start + (end - start) / 2;
            
            if(nums[mid] == target)
                return mid;
            
            // check if left part is sorted
            if(nums[start] <= nums[mid]) {
                // target is in left sorted part
                if(target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // right part is sorted
            else {
                if(target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        
        return -1;
    }
}
