class KthLargest {
    public PriorityQueue<Integer> ans;
    public int count = 0;
    public KthLargest(int k, int[] nums) {
        ans = new PriorityQueue<>((a,b) -> a-b);
        count = k;
        for(int i=0;i<nums.length;i++)
        {
            ans.offer(nums[i]);
            if(ans.size() > count)
            {
                ans.poll();
            }
        }
    }

    
    public int add(int val) {
        ans.offer(val);
        if(ans.size()>count)
        {
            ans.poll();
        }
        return ans.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */