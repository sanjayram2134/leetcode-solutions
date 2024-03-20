class Solution {

    public boolean isSubsequence(String s, String t) {
        int count = 0;
        int slength = s.length(), i;
        if(s.length() == 0)
            return true;
        for(i =0;i<t.length();i++){
            if(s.charAt(count) == t.charAt(i)){
                count++;

                if(count == slength)
                    return true;
            }
        }

        return false;
    }
}