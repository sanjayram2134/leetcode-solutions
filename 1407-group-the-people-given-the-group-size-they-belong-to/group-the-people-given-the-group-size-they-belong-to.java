class Solution {
    public List<List<Integer>> groupThePeople(int[] gs) {
        Map <Integer,List<Integer>> map = new HashMap<>(); 
        List<List<Integer>> ans = new ArrayList<>();
        int l = gs.length;
        for(int i=0;i<l;i++)
        {
           int size = gs[i];
           List<Integer> temp = new ArrayList<>();
           if(map.containsKey(size))
           {
               temp = map.get(size);
           }
           temp.add(i);
           map.put(size,temp);

           if(temp.size()==size)
           {
               ans.add(temp);
               map.remove(size);
           }
        }
        return ans;
    }
}