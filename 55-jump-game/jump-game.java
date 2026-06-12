class Solution {
    public boolean canJump(int[] nums) {
        int maxlen = 0;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(i > maxlen){
                return false;
            }
            maxlen = Math.max(maxlen,i+nums[i]);
        }
        return true;
    }
}