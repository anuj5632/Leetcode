class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }

        for(List<Integer> list : map.values()){
            if(list.size() == 1){
                continue;
            }
            for(int i = 0;i<=list.size()-2;i++){
                int diff = Math.abs(list.get(i+1) - list.get(i));
                if(diff <= k){
                    return true;
                }
                else{
                    continue;
                }
            }
        }
        return false;
    }
}