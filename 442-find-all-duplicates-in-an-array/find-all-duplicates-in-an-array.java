class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> hash = new HashSet<>();
        for(int i = 0;i < n;i++){
            if(!hash.contains(nums[i])){
                hash.add(nums[i]);
            }
            else{
                list.add(nums[i]);
            }
        }
        return list;
    }
}