class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int ans = 0;
        int left = 0;
        int right = (int)Math.ceil(position[n - 1] / (m - 1.0));
        while(left<=right)
        {
            int mid =left + (right-left)/2;
            if(canplace(mid,position,m)){
                ans = mid;
                left = mid + 1;
            }
            else{
                right = mid -1;
            }


        }
        return ans;

    }
    public boolean canplace(int mid,int position[],int m)
    {
        int prev = position[0];
        int ballplaced = 1;
        for(int i=1;i<position.length && ballplaced < m;i++)
        {
            int curr = position[i];
            if(curr-prev>=mid)
            {
                prev = curr;
                ballplaced++;
            }
        }
        return ballplaced == m;
    }
}