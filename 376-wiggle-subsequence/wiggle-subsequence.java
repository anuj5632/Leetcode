class Solution {
    public int func(int ind, int next, int[] nums, int n, int flag,int[][] dp){
        if(next >= n){
            return 1;
        }

        int diff = nums[next] - nums[ind];

        int take = 0;
        int notTake = 0;
        if(dp[ind][next] != -1){
            return dp[ind][next];
        }

        if(flag == 0){ 
            if(diff > 0)
                take = 1 + func(next, next + 1, nums, n, 1,dp);
            else if(diff < 0)
                take = 1 + func(next, next + 1, nums, n, -1,dp);
        }
        else if(flag == 1 && diff < 0){
            take = 1 + func(next, next + 1, nums, n, -1,dp);
        }
        else if(flag == -1 && diff > 0){
            take = 1 + func(next, next + 1, nums, n, 1,dp);
        }

        notTake = func(ind, next + 1, nums, n, flag,dp);

        return dp[ind][next] =  Math.max(take, notTake);
    }

    public int wiggleMaxLength(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                dp[i][j] = -1;
            }
        }
        return func(0, 1, nums, n, 0,dp);
    }
}