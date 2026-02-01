class Solution {
    public int minimumCost(int[] nums) {
        int n = nums.length;
        int first = nums[0];
        Arrays.sort(nums,1,n);
        int sum = first + nums[1] + nums[2];
        return sum;
    }
}