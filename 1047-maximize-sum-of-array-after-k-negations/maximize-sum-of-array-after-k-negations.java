class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0;i<n;i++){
            if(nums[i] < 0 && k > 0){
                nums[i] *= -1;
                k--;
            }
        }
        Arrays.sort(nums);
        if(k % 2 == 1){
            nums[0] *= -1;
        }
        for(int j = 0;j<n;j++){
            sum += nums[j];
        }
        return sum;
    }
}