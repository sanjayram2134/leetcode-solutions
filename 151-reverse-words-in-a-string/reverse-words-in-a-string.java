class Solution {
    public String reverseWords(String s) {
         String[] words =s.trim().split("\\s+");
         int l = words.length;
         String ans = "";
         for(int i=l-1;i>=0;i--)
         {
            ans+=words[i];
            if(i!=0)
            {
                ans+=" ";
            }
         }
         return ans;        
    }
}