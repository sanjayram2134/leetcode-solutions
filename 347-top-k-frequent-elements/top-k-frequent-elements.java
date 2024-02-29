class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int l = nums.length,j=0;
        int ans[]= new int[k];
        
        Map<Integer,Integer> buck = new HashMap<>();
        for(int i:nums)
        {
        if (buck.containsKey(i))
        { 
            buck.put(i,buck.get(i)+1);
        }
        else
        {
            buck.put(i,1);
        }
        }
         for(int i = 0 ; i< k ;i++){
          int freq = 0;
           int max = 0;
           for(Map.Entry<Integer,Integer> val : buck.entrySet()){
               if(val.getValue() > freq){
                   freq = val.getValue();
                   max = val.getKey();
               }
           }
            buck.put(max,0);
            ans[j] = max;
            j++;
       }
       return ans;
    }
     
}