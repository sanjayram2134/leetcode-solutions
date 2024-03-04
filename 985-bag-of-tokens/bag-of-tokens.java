class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score = 0;
        int z = 0;
        int left = 0;
        int high = tokens.length - 1;

        while(left<=high)
        {
           
            if(power>=tokens[left])
            {
                score++;
                power-=tokens[left];
                left++;
            }
            else if(score>=1)
            {
                power+=tokens[high];
                score--;
                high--;
            }
            else
            {
                break;
            }
           
            z = Math.max(score,z);
        }
        return z;
    }
}