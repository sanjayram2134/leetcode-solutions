class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
          // Split the input text into words
        String[] words = text.split(" ");

        // Set to store broken letters for efficient lookup
        HashSet<Character> brokenSet = new HashSet<>();
        for (char c : brokenLetters.toCharArray()) {
            brokenSet.add(c);
        }

        // Variable to keep track of the count of fully typed words
        int fullyTypedWords = 0;

        // Iterate through each word and check for broken letters
        for (String word : words) {
            boolean isWordFullyTyped = true;

            // Check each letter in the word
            for (char c : word.toCharArray()) {
                if (brokenSet.contains(c)) {
                
                    isWordFullyTyped = false;
                    break;
                }
            }

            
            if (isWordFullyTyped) {
                fullyTypedWords++;
            }
        }

        return fullyTypedWords;
    

    }
}