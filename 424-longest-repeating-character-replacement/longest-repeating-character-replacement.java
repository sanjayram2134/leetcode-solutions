class Solution {
    public int characterReplacement(String s, int k) {
        int l = s.length();
        int start = 0;
        int end = 0;
        int maxrep = 0;
        int maxlen = 0;
        int nonrep = 0;
        Map<Character,Integer> ans  = new HashMap<>();
        while(end<l)
        {
            char ch = s.charAt(end);
            ans.put(ch,ans.getOrDefault(ch,0)+1);
            int window  = end-start+1;
            int rep = ans.get(ch);
            maxrep = Math.max(maxrep,rep);
            nonrep = window-maxrep;
            if(nonrep > k)
            {
                ans.put(s.charAt(start),ans.get(s.charAt(start))-1);
                start++;
                
            }
            maxlen = Math.max(maxlen,end-start+1);
            end++;

        }
        return maxlen;
    }
}