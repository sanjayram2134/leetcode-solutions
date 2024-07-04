class Solution {
    public int numEnclaves(int[][] grid) {
        int count = 0;
        int delrow[] = {-1, 0, +1, 0};
        int delcol[] = {0, 1, 0, -1}; 

        int m = grid.length;
        int n = grid[0].length;
        int vis[][] = new int[m][n];

        for(int i=0;i<m;i++)
        {
            if(grid[i][0] == 1 && vis[i][0]==0)
            {
                dfs(i,0,delrow,delcol,vis,grid);
            }
            if(grid[i][n-1] == 1 && vis[i][n-1]==0)
            {
                dfs(i,n-1,delrow,delcol,vis,grid);
            }

        }
        for(int i=0;i<n;i++)
        {
            if(grid[0][i]==1 && vis[0][i]==0)
            {
                dfs(0,i,delrow,delcol,vis,grid);
            }
            if(grid[m-1][i]==1 && vis[m-1][i]==0)
            {
                dfs(m-1,i,delrow,delcol,vis,grid);
            }

        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(vis[i][j]==0 && grid[i][j] == 1)
                {
                    count++;
                }
            }
        }
         
         return count;
    }
    public static void dfs(int row,int col,int[] delrow,int[] delcol,int[][] vis,int[][] grid)
    {
         int m = grid.length;
         int n = grid[0].length;
         vis[row][col] = 1;
         for(int i =0;i<4;i++)
         {
            int nrow = row+delrow[i];
            int ncol = col+delcol[i];

            if(nrow>=0 && ncol>=0 && nrow<m && ncol<n && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
               dfs(nrow,ncol,delrow,delcol,vis,grid); 
            }
         }
    }
}