class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        int maxI = Integer.MIN_VALUE;
        int ansMax = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            maxI = Math.max(maxI,nums[i]);
            if(i == ans){
                ansMax = Math.max(ansMax,nums[i]);
            }
            if(nums[i] < ansMax - k){
                ans = i+1;
                ansMax = maxI;
            }
        }

        if(ans < n){
            return ans;
        }
        return -1;

        
    }
}