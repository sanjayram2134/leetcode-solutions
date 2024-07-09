class Solution {
    public double averageWaitingTime(int[][] customers) {
        int counter = customers[0][0];
        int m = customers.length;
        double total = 0;
        
        for(int i=0;i<m;i++)
        {
            if(counter < customers[i][0])
            {
                counter = customers[i][0];
            }
            counter+=customers[i][1];
            int z = counter - customers[i][0];
            total+=z;
        }
        return (double)total/m;
        
    }
}