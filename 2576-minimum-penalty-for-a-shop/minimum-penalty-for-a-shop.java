class Solution {
    public int bestClosingTime(String cust) {
        int l = cust.length();
        int curr = 0,min = 0,time = 0;
        for(int i=0;i<l;i++)
        {
            if(cust.charAt(i)=='Y')
            {
                curr++;
            }
        }
        min = curr;
        for(int i=0;i<l;i++)
        {
            char ch = cust.charAt(i);
            if(ch=='Y')
            {
                curr--;
            }
            else
            {
                curr++;
            }
            if(curr<min)
            {
                min = curr;
                time = i+1;
            }
        }
        return time;
    }
}