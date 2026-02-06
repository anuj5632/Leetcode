class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0;
        int maxlen = 0;
        for(int j = 0;j<n;j++){
            while((long)nums[j] > (long)nums[i]*k){
                i++;
            }
            maxlen = Math.max(maxlen,j-i+1);
        }
        return n-maxlen;
    }
}