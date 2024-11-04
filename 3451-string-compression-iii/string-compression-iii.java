class Solution {
    public String compressedString(String word) {
        if (word == null || word.isEmpty()) {
            return "";
        }
        
        String ans = "";
        int count = 1;
        
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                count++;
                // Limit the count to 9 for compression
                if (count > 9) {
                    ans += "9" + word.charAt(i - 1);
                    count = 1;
                }
            } else {
                ans += count + "" + word.charAt(i - 1);
                count = 1;
            }
        }
        
        // Append the last character and its count
        ans += count + "" + word.charAt(word.length() - 1);
        
        return ans;
    }
}
