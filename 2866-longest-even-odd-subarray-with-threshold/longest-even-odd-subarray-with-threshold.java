class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int n = nums.length;
        int maxLen = 0;
        int i = 0;
        while (i < n) {
            if (nums[i] % 2 == 0 && nums[i] <= threshold) {
                int start = i;
                i++;
                while (i < n && nums[i] <= threshold && nums[i] % 2 != nums[i - 1] % 2) {
                    i++;
                }
                maxLen = Math.max(maxLen, i - start);
            } else {
                i++;
            }
        }
        return maxLen;
    }
}