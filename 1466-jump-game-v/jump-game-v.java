class Solution {
    int[] dp;
    public int help(int[] arr, int d, int i){
        if(dp[i] != 0){
            return dp[i];
        }

        int ans = 1;
        int n = arr.length;

        for(int j = i + 1; j <= Math.min(i + d, n - 1); j++){
            if(arr[j] >= arr[i]){
                break;
            }

            ans = Math.max(ans, 1 + help(arr, d, j));
        }

        for(int j = i - 1; j >= Math.max(i - d, 0); j--){
            if(arr[j] >= arr[i]){
                break;
            }

            ans = Math.max(ans, 1 + help(arr, d, j));
        }

        return dp[i] = ans;
    }

    public int maxJumps(int[] arr, int d) {
        int n = arr.length;
        dp = new int[n];

        int ans = 1;

        for(int i = 0; i < n; i++){
            ans = Math.max(ans, help(arr, d, i));
        }

        return ans;
    }
}