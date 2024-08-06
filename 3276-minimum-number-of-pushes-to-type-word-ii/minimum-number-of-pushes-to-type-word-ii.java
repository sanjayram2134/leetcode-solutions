class Solution {
    public int minimumPushes(String word) {
        int buttoncount = 8;
        int totalcost = 0;
        int initialcost = 1;
        Map<Character, Integer> frequencyMap = countCharacterOccurrences(word);
        
        List<Map.Entry<Character, Integer>> sortedEntries = sortByValue(frequencyMap);
        
        int temp = 0;
        for (Map.Entry<Character, Integer> entry : sortedEntries) {
            if(temp==buttoncount)
            {
                initialcost+=1;
                temp = 0;
            }
             totalcost += entry.getValue()*initialcost;
             temp++;
            //System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        return totalcost;

    }
    public static Map<Character, Integer> countCharacterOccurrences(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        return frequencyMap;
    }

   
    public static List<Map.Entry<Character, Integer>> sortByValue(Map<Character, Integer> map) {
        List<Map.Entry<Character, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        return entries;
    }
}