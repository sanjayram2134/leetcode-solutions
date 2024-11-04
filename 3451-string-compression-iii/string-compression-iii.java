class Solution {
    public String compressedString(String word) {
        if (word == null || word.isEmpty()) {
            return "";
        }
        
        StringBuilder ans = new StringBuilder();
        int count = 1;
        
        // Iterate over the word starting from the second character
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                count++;
                // Limit the count to 9 for compression
                if (count > 9) {
                    count = 1;
                    ans.append(9).append(word.charAt(i - 1));
                }
            } else {
                ans.append(count).append(word.charAt(i - 1));
                count = 1;
            }
        }
        
        // Append the last character and its count
        ans.append(count).append(word.charAt(word.length() - 1));
        
        return ans.toString();
    }
}
