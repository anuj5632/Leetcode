class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }

        for(int i = 1;i<=n+1;i++){
            int m = k*i;
            if(!set.contains(m) && m % k == 0){
                ans = Math.min(ans,m);
            }
        }
        return ans;
    }
}