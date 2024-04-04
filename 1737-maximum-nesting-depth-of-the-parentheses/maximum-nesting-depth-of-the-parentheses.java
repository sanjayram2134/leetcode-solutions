class Solution {
    public int maxDepth(String s) {
        int l = s.length();
        int count = 0;
        int max = 0;
        int i=0;
        while(i<l)
        {
            char ch = s.charAt(i);
            if(ch=='(')
            {
                count++;
                max = Math.max(max,count);
            }
            else if(ch==')')
            {
                  count--;
            }
            
            i++;

        }
        return max;
    }
}