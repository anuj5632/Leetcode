class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int ans = -1;
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j <= n - k; j++){
                for(int m = j; m < j + k; m++){
                    if(nums[m] == nums[i]){
                        count++;
                        break;
                    }
                }
            }

            if(count == 1){
                ans = Math.max(ans, nums[i]);
            }
        }

        return ans;
    }
}