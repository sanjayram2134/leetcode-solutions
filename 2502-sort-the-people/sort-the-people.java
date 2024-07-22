class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int l = heights.length;
        Map<Integer,String> map = new HashMap<>();
        for(int i=0;i<l;i++)
        {
            map.put(heights[i],names[i]);
        }
        Integer[] sortedHeights = map.keySet().toArray(new Integer[0]);
        Arrays.sort(sortedHeights, Collections.reverseOrder());
        
        String ans[] = new String[l];
        for(int i=0;i<l;i++)
        {
            ans[i] = map.get(sortedHeights[i]);
        }
        return ans;
    }
}