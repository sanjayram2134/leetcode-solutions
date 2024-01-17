class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> ans = new HashMap<>();
        int l = arr.length;
        for(int i:arr)
        {
            ans.put(i,ans.getOrDefault(i, 0) + 1);
        }
        List<Integer> co = new ArrayList<>();  
        for (int occurrences : ans.values()){
            System.out.println(occurrences);
            if(co.contains(occurrences))
            {
                return false;
            }
           else if(!co.contains(occurrences))
            {
                co.add(occurrences);
            }
        }

        return true;
    }
}