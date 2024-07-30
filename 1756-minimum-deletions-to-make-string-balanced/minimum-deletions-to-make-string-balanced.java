class Solution {
    public int minimumDeletions(String s) {
        int l = s.length();
        int dp[] = new int[l+1];
        dp[0] = 0;
        int counter = 0;
        for(int i=1;i<=l;i++)
        {
             if(s.charAt(i-1)=='b')
             {
                dp[i] = 1 + dp[i-1];
             }
             else
             {
                if(dp[i-1]>0)
                {
                    counter++; 
                    //dp[i-1] = dp[i-1] - 1;
                    dp[i] = --dp[i-1];   
                }
                else
                {
                    dp[i] = 0;
                }
               
             }
        }
        return counter;
    }
}