class Solution {
    public int func1(int[] nums,int i){
        int maxN = Integer.MIN_VALUE;
        for(int j = 0;j<=i;j++){
            maxN = Math.max(maxN,nums[j]);
        }
        return maxN;
    }
    public int func2(int[] nums,int i){
        int minN = Integer.MAX_VALUE;
        for(int j = i;j<nums.length;j++){
            minN = Math.min(minN,nums[j]);
        }
        return minN;
    }

    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        //int minI = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            int maxN = func1(nums,i);
            int minN = func2(nums,i);
            int diff = maxN - minN;
            if(diff <= k){
                return i;
            }
        }
        return -1;
    }
}