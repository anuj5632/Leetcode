class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        int max = 0;
        int ans = 0;
        for(int i = 0;i<n;i++){
            max = Math.max(max,nums[i]);
        }

        for(int i = 0;i<n;i++){
            if(nums[i] == max){
                continue;
            }
            else{
                if(max >= 2*nums[i]){
                    continue;
                }
                else{
                    return -1;
                }
            }
        }

        for(int i = 0;i<n;i++){
            if(max == nums[i]){
                ans = i;
            }
        }
        return ans;   
    }
}