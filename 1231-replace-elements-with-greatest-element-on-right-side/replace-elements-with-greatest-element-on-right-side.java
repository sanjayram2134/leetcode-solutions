class Solution {
    public int[] replaceElements(int[] arr) {
        int l= arr.length;
        if(l==1)
        {
            arr[0] = -1;
        }
        for(int i=0;i<l-1;i++)
        {
             int z = 0;
            for(int j=i+1;j<l;j++)
            {
               
                if(z<arr[j])
                {
                    z=arr[j];
                }

            }
            arr[i] = z;
        }
        arr[l-1] = -1;
        return arr;
    }
}