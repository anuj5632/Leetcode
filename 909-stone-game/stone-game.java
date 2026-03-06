class Solution {
    public boolean stoneGame(int[] piles) {
        int countA = 0;
        int countB = 0;
        int n = piles.length;
        Arrays.sort(piles);
        for(int i = n-1;i>=0;i--){
            if(n % 2 == 0){
                countA += piles[i];
            }
            else{
                countB += piles[i];
            }
        }
        return countA > countB;
    }
}