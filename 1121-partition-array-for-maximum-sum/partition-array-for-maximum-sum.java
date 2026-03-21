class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n];

        for(int i = 0; i < n; i++){
            int max = 0;

            for(int len = 1; len <= k && i - len + 1 >= 0; len++){
                if (arr[i - len + 1] > max) {
                    max = arr[i - len + 1];
                }
                int prev;
                if(i >= len){
                    prev = dp[i - len];
                }
                else{
                    prev = 0;
                }

                int current = prev + max * len;

                if(current > dp[i]){
                    dp[i] = current;
                }
            }
        }

        return dp[n - 1];
    }
}