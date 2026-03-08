class Solution {
    public int func(String text1,String text2,int ind1,int ind2,int[][] dp){
        if(ind1 < 0 || ind2 < 0){
            return 0;
        }
        if(dp[ind1][ind2] != -1){
            return dp[ind1][ind2];
        }
        if(text1.charAt(ind1) == text2.charAt(ind2)){
            return dp[ind1][ind2] = 1 + func(text1,text2,ind1-1,ind2-1,dp);
        }
        else{
            return dp[ind1][ind2] = Math.max(func(text1,text2,ind1,ind2-1,dp),func(text1,text2,ind1-1,ind2,dp));
        }

    }
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                dp[i][j] = -1;
            }
        }
        String rs = new StringBuilder(s).reverse().toString();
        return func(s,rs,n-1,n-1,dp);
    }
}