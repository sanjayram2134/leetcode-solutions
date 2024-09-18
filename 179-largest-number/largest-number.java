class Solution {
    public String largestNumber(int[] nums) {
        int l = nums.length;
        String []numstring =  new String[l];
        for(int i=0;i<l;i++)
        {
            numstring[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(numstring, (a,b) -> (b + a).compareTo(a + b));

        if(numstring[0].equals("0"))
        {
            return "0";
        }

        StringBuilder largestnum = new StringBuilder();;
        for(String numStr : numstring)
        {
            largestnum.append(numStr);
        }

        return largestnum.toString();
    }
}