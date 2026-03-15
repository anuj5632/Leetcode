class Solution {
    public int func(int ind, int buy, int cap, int[] prices, int n,int[][][] dp){
        if(ind == n || cap == 0){
            return 0;
        }
        if(dp[ind][buy][cap] != -1){
            return dp[ind][buy][cap];
        }

        if(buy == 1){
            return dp[ind][buy][cap]= Math.max(
                -prices[ind] + func(ind+1, 0, cap, prices, n,dp),
                0 + func(ind+1, 1, cap, prices, n,dp)
            );
        }

        return dp[ind][buy][cap] = Math.max(
            prices[ind] + func(ind+1, 1, cap-1, prices, n,dp),
            0 + func(ind+1, 0, cap, prices, n,dp)
        );
    }

    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n][2][3];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<2;j++){
                for(int k =0;k<3;k++){
                    dp[i][j][k] = -1;
                }
            }
        }
        return func(0, 1, 2, prices, n,dp);
    }
}