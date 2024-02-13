class Solution {
    public String firstPalindrome(String[] words) {
        String ans = "";
        int l = words.length;
        for(int i=0;i<l;i++)
        {
              if(isPalindrome(words[i]))
              {
                  return words[i];
              }
        }
        return ans;
    }
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while(left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}