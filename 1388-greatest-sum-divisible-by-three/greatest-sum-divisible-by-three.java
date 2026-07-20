class Solution {
    public int maxSumDivThree(int[] nums) {
        int[] dp = new int[3];

        for(int n : nums){
            int[] curr = dp.clone();
            for(int n1 : curr){
                int newSum = n + n1;
                int remainder = newSum % 3;
                dp[remainder] = Math.max(dp[remainder],newSum);
            }
        }
        return dp[0];
    }
}