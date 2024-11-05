class Solution {

    public int minChanges(String s) {
      int changes = 0;

        // Traverse the string in steps of 2 to check each pair
        for (int i = 0; i < s.length(); i += 2) {
            // Check if the pair of characters are different
            if (s.charAt(i) != s.charAt(i + 1)) {
                changes++;  // Increment changes to make the pair uniform
            }
        }

        return changes;
    }
}