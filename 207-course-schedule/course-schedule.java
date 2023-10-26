class Solution {
    public boolean dfs(Integer i,Map<Integer,List<Integer>> map,Set<Integer> visitSet)
    {
        if(visitSet.contains(i))
        {
            return false;
        }
        if(map.get(i)==null){
        return true;
        }
        visitSet.add(i);
        for(Integer x:map.get(i))
        {
            if (dfs(x,map,visitSet)==false)
            return false;
        }
        visitSet.remove(i);
        List<Integer> l=new ArrayList<>();
        map.put(i,l);
        return true;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
	    Set<Integer> visitSet=new HashSet<>();
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int[] i:prerequisites)
        {
            List<Integer> l=new ArrayList<>();
            if(map.get(i[0])==null)
            l.add(i[1]);
            else{
            l.addAll(map.get(i[0]));
            l.add(i[1]);
            }
            map.put(i[0],l);
        }
        for(int[] i:prerequisites)
        {
            if(dfs(i[0],map,visitSet)==false)
            return false;
        }
        return true;
    }
}