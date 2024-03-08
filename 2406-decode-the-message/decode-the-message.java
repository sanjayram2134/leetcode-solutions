class Solution {
  public static Map<Character, Character> constructSubstitutionTable(String key) {
        Map<Character, Character> substitutionTable = new HashMap<>();
        int index = 0;
        for (char ch : key.toCharArray()) {
            if (Character.isLetter(ch) && !substitutionTable.containsKey(Character.toLowerCase(ch))) {
                substitutionTable.put(Character.toLowerCase(ch), (char) ('a' + index));
                index++;
            }
        }
        return substitutionTable;
    }

    public static String decodeMessage(String key, String message) {
        Map<Character, Character> substitutionTable = constructSubstitutionTable(key);

        StringBuilder decodedMessage = new StringBuilder();
        for (char ch : message.toCharArray()) {
            if (Character.isLetter(ch)) {
                char substitute = substitutionTable.getOrDefault(Character.toLowerCase(ch), ch);
                if (Character.isUpperCase(ch)) {
                    decodedMessage.append(Character.toUpperCase(substitute));
                } else {
                    decodedMessage.append(substitute);
                }
            } else if (ch == ' ') {
                decodedMessage.append(' ');
            }
        }
        return decodedMessage.toString();
    }
}