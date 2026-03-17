class Solution {
    public int longestIdealString(String s, int k) {
        int[] dp = new int[26];
        int ans = 0;
        for(char ch : s.toCharArray()){
            int curr = ch - 'a';
            int best = 0;
            for(int j = Math.max(0, curr - k); 
                j <= Math.min(25, curr + k); 
                j++){
                best = Math.max(best, dp[j]);
            }
            dp[curr] = best + 1;
            ans = Math.max(ans, dp[curr]);
        }
        return ans;
    }
}