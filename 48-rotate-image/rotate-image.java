class Solution {
    public void rotate(int[][] matrix) {
        for(int i = 0 ; i<matrix.length ; i++){
            for(int j = i ; j<matrix.length ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp ;

            }
        }
        for(int i = 0 ; i<matrix.length; i++){
            int start = 0;
            int end = matrix[i].length -1;
            while(start < end){
                matrix[i][start] = matrix[i][start] + matrix[i][end];
                matrix[i][end] = matrix[i][start] - matrix[i][end];
                matrix[i][start] = matrix[i][start] - matrix[i][end];
                start++;
                end--;

            }
        }    
    }
}