class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int n = values.length;

        int best = values[0] + 0;
        int ans = 0;

        for(int j = 1; j < n; j++){
            ans = Math.max(ans, best + values[j] - j);

            best = Math.max(best, values[j] + j);
        }
        return ans;
    }
}