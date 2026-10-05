class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum += nums[i];
        }

        int l = 0;
        int right = sum;
        for(int i = 0;i<n;i++){
            right -= nums[i];
            result[i] = nums[i]*i-l+right-nums[i]*(n-i-1);
            l += nums[i];
        }
        return result;
    }
}