class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0;i<n;i++){
            sum += nums[i];
        }

        int curr_sum = 0;
        for(int i = n-1;i>=0;i--){
            curr_sum += nums[i];
            sum -= nums[i];
            list.add(nums[i]);

            if(curr_sum > sum){
                return list;
            }
        }

        return list;
    }
}