class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int pick = 0;
        while(k-- > 0){
            if(numOnes > 0){
                pick++;
                numOnes--;
            }
            else if(numZeros > 0){
                numZeros--;
                continue;
            }
            else{
                numNegOnes--;
                pick--;
            }
        }
        return pick;
    }
}