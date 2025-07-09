class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        Set<Character> ch = new HashSet<>();
        int ans = 0;
        int st = 0;
        for(int i=0;i<len;i++)
        {
            if(!ch.contains(s.charAt(i)))
            {
                ch.add(s.charAt(i));
                ans = Math.max(ans,i-st+1);
            }
            else
            {
                while(ch.contains(s.charAt(i)))
                {
                    ch.remove(s.charAt(st));
                    st++;
                }
                ch.add(s.charAt(i));
            }
        }
        return ans;
    }
}