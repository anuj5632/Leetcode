class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int maxN = nums[n-1];
        int minN = nums[0];
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<n;i++){
            set.add(nums[i]);
        }
        for(int i = minN;i<=maxN;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}