class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long maxScore = 0;
        for(int i = 0;i<n;i++){
            nums[i] *= nums[i]; 
        }

        Arrays.sort(nums);

        for(int i = 0;i<n/2;i++){
            maxScore -= nums[i];
        }

        for(int i = n/2;i<n;i++){
            maxScore += nums[i];
        }

        return maxScore;

    }
}