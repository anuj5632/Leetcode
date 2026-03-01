class Solution {
    public double largestSumOfAverages(int[] nums, int k) {
        int n = nums.length;
        double[] prefixSum = new double[n+1];
        for(int i = 0;i<n;i++){
            prefixSum[i+1] = prefixSum[i] + nums[i];
        }
        double[][] dp = new double[n+1][k+1];

        for(int i = 0;i<=n;i++){
            dp[i][1] = prefixSum[i]/i;
        }

        for(int j = 2; j <= k; j++){
            for(int i = j; i <= n; i++){
                for(int x = j - 1; x < i; x++){
                    dp[i][j] = Math.max(
                        dp[i][j],
                        dp[x][j - 1] + (prefixSum[i] - prefixSum[x]) / (i - x)
                    );
                }
            }
        }

        double maxScore = 0;
        for(int i = 0;i<=k;i++){
            maxScore = Math.max(maxScore,dp[n][i]);
        }
        return maxScore;
    }
}