class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        
        s = s.trim();
        int l = s.length();
        int i=0;
        while(i<l)
        {
            char ch = s.charAt(i);
            if(ch==' ')
            {
                count=0;
            }
            else
            {
                count++;
            }
          i++;
        }
        return count;
    }
}