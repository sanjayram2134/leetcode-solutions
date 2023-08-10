class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        Map<Integer, Integer> map = new TreeMap<>();

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                map.put(matrix[i][j], map.getOrDefault(matrix[i][j], 0) + 1);
            }
        }

        for(int i : map.keySet()) {
            k -= map.get(i);

            if(k <= 0) {
                return i;
            }
        }

        return -1;
    }
}