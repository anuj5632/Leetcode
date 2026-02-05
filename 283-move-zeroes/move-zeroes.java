class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = start + 1;
        while(start < n && end < n){
            if(nums[start] == 0 && nums[end] != 0){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end++;
            }
            else if(nums[start] != 0){
                start++;
                end++;
            }
            else{
                end++;
            }
        }
    }
}