class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
         
        String[] words = text.split(" ");

       
        HashSet<Character> brokenSet = new HashSet<>();
        for (char c : brokenLetters.toCharArray()) {
            brokenSet.add(c);
        }

       
        int fullyTypedWords = 0;

        
        for (String word : words) {
            boolean isWordFullyTyped = true;

            
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