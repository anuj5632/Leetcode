class Solution {
    public int minPatches(int[] nums, int n) {
        int m = nums.length;
        long rem = 1;
        int result = 0;
        int i = 0;

        while(rem <= n){
            if(i < m && nums[i] <= rem){
                rem += nums[i];
                i++;
            }
            else{
                rem += rem;
                result++;
            }
        }
    return result;
    }
}