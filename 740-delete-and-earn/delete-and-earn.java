 class Solution{
 public int deleteAndEarn(int[] nums) {
    Arrays.sort(nums);
    return earned(nums, 0, new int[nums.length]);
  }

private int earned(int[] nums, int idx, int[] memo){
    if(idx == nums.length)
      return 0;
    if(memo[idx] == 0) {
      
      int earned = nums[idx];
      int skip = idx + 1;
      
      
      while(skip < nums.length && nums[skip] == nums[idx]){
        earned += nums[idx];
        skip++;
      }

 
      while(skip < nums.length && nums[skip] == nums[idx] + 1){
        skip++;
      }
      
      earned += earned(nums, skip, memo);
      int skipped = earned(nums, idx + 1, memo);
      memo[idx] = Math.max(earned, skipped);
    }

    return memo[idx];
  }
 }