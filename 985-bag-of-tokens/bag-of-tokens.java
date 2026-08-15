class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score = 0;
        int n = tokens.length;
        int maxS = 0;
        int left = 0;
        int right = n-1;
        while(left <= right){
            if(power >= tokens[left]){
                power -= tokens[left];
                score++;
                left++;
                maxS = Math.max(score,maxS);
            }
            else if(score > 0){
                power += tokens[right];
                score--;
                right--;
            }
            else{
                break;
            }
        }
    return maxS;
    }
}