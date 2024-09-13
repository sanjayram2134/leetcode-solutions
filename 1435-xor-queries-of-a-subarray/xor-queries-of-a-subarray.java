class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int l = arr.length;
        int l1 = queries.length;
        int ans[] = new int[l1];
        for(int i=0;i<l1;i++)
        {
            int le = queries[i][0];
            int r = queries[i][1];
            for(int j=le;j<=r;j++)
            {
                ans[i] ^= arr[j];
            }
        }
        return ans;
    }
}