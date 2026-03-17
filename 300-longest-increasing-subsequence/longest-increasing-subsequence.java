class Solution {
    public int func(int ind,int prev_ind,int n,int[] nums,int[][] dp){
        int len = 0;
        if(ind == n){
            return 0;
        }
        if(dp[ind][prev_ind + 1] != -1){
            return dp[ind][prev_ind+1];
        }
        len = 0 + func(ind+1,prev_ind,n,nums,dp);
        if(prev_ind == -1 || nums[ind] > nums[prev_ind]){
            len = Math.max(len,1+func(ind+1,ind,n,nums,dp));
        }
        return dp[ind][prev_ind+1] = len;
    }
    public int lengthOfLIS(int[] nums) {
       int n = nums.length;
       int[][] dp = new int[n][n];
       for(int i = 0;i<n;i++){
          for(int j = 0;j<n;j++){
            dp[i][j] = -1;
        }
       }
       return func(0,-1,n,nums,dp);
    }
}
