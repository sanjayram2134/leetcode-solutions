class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int l = 0, r = (m * n) - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            int e = matrix[mid / m][mid % m];

            if (e > target) {
                r = mid - 1;
            } else if (e < target) {
                l = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}