class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int a = 0;
        for(int i : nums){
            if(i > nums[a]){
                a++;
            }
        }
        return a;
    }
}