class Solution {
      public int func(String text1,String text2,int ind1,int ind2,int[][] dp){
        if(ind1 < 0){
            return ind2+1;
        }
        if(ind2 < 0){
            return ind1 + 1;
        }
        if(dp[ind1][ind2] != -1){
            return dp[ind1][ind2];
        }
        if(text1.charAt(ind1) == text2.charAt(ind2)){
            return dp[ind1][ind2] = 0 + func(text1,text2,ind1-1,ind2-1,dp);
        }
        else{
            return dp[ind1][ind2] = Math.min(Math.min(1+func(text1,text2,ind1-1,ind2,dp),1+func(text1,text2,ind1-1,ind2-1,dp)),1+func(text1,text2,ind1,ind2-1,dp));
        }

    }
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n][m];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                dp[i][j] = -1;
            }
        }
        return func(word1,word2,n-1,m-1,dp);
    }
}