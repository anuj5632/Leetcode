class Solution {
    public boolean isIncreasing(int[] nums){
        for(int i = 1;i<nums.length;i++){
            if(nums[i-1] > nums[i]){
                return false;
            }
        }
        return true;
    }
    public boolean isDecreasing(int[] nums){
        for(int i = 1;i<nums.length;i++){
            if(nums[i-1] < nums[i]){
                return false;
            }
        }
        return true;
    }
    public boolean isMonotonic(int[] nums) {
        if(isIncreasing(nums) || isDecreasing(nums)){
            return true;
        }
        return false;
    }
}