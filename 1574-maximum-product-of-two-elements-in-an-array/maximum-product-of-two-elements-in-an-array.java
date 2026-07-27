class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxP = 0;
        Arrays.sort(nums);
        maxP = (nums[n-1]-1) * (nums[n-2]-1);
        return maxP;
    }
}