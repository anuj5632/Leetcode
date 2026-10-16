class Solution {
    public int dp(int[] slices, int m) {
        int n = slices.length;
        int[][] dp = new int[n + 1][m + 1];

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(i == 1){
                    dp[i][j] = slices[0];
                }
                else{
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 2][j - 1] + slices[i - 1]);
                }
            }
        }

        return dp[n][m];
    }

    public int maxSizeSlices(int[] slices) {
        int n = slices.length;
        int[] fir = Arrays.copyOfRange(slices, 0, n - 1);
        int[] sec = Arrays.copyOfRange(slices, 1, n);
        return Math.max(dp(fir, n / 3), dp(sec, n / 3));
    }
}