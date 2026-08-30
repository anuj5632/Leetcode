class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int minInd = 0;
        int maxInd = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] < nums[minInd]){
                minInd = i;
            }

            if(nums[i] > nums[maxInd]){
                maxInd = i;
            }
        }

        int left = Math.min(minInd, maxInd);
        int right = Math.max(minInd, maxInd);

        int deleteLeft = right + 1;

        int deleteRight = n - left;

        int deleteBoth = (left + 1) + (n - right);

        return Math.min(deleteLeft,
                Math.min(deleteRight, deleteBoth));
    }
}