class Solution {
    public int minDeletions(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        Queue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);

        heap.addAll(map.values());
        int count= 0;
        while(heap.size()>1)
        {
            int top = heap.poll();
            if(heap.peek()!=null && heap.peek()==top && top !=0)
            {
                count++;
                heap.add(top-1);
            }
        }
        return count;
    }
}