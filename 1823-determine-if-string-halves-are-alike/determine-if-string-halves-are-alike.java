class Solution {
    public boolean halvesAreAlike(String s) {
         int midPoint = s.length() / 2;
        String a = s.substring(0, midPoint);
        String b = s.substring(midPoint);

        return countVowels(a) == countVowels(b);
    }
    private static int countVowels(String str) {
        int count = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}