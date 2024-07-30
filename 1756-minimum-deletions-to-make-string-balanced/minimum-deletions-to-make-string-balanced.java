class Solution {
    public int minimumDeletions(String s) {
      int l = s.length();
      int count = 0;
      Stack<Character> st = new Stack<>();
      for(int i=0;i<l;i++)
      {
        if(s.charAt(i)=='b')
        {
            st.push('b');
        }
        else
        {
            if(!st.isEmpty())
            {
                st.pop();
                count++;
            }
            else
            {
                continue;
            }
        }
      }
      return count;
    }
}