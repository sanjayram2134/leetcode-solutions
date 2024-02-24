class Solution {
    public int findChampion(int[][] grid) {
        int l = grid.length;
        int index = 0;
        int ans[] = new int[l];
        int z=0;
        for(int i=0;i<l;i++)
        {   int c = 0;
            for(int j=0;j<l;j++)
            {
                if(grid[i][j]==1)
                {
                    c++;
                }
            }
         if(c>z)
         {
             z=c;
             index = i;
         }
         //ans[i] = c;
        }
        //System.out.println(ans[1]);
        return index;
    }
}