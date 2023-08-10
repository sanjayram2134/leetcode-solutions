class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> ans = new ArrayList<>();
        for(int[] arr:intervals)
        {
            if(ans.isEmpty() || arr[0] > ans.get(ans.size()-1)[1])
            {
                ans.add(arr);
            }
            else
            {
                ans.get(ans.size()-1)[1] = Math.max(arr[1], ans.get(ans.size()-1)[1]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}