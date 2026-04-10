class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        int minDist = Integer.MAX_VALUE;
        for(List<Integer> list : map.values()){
            if(list.size() < 3){
                continue;
            }
            for(int i = 0;i<=list.size()-3;i++){
                int a = list.get(i);
                int c = list.get(i+2);
                int dist = 2*(c-a);
                minDist = Math.min(minDist,dist);
            }
        }
        if(minDist == Integer.MAX_VALUE){
            return -1;
        }
        return minDist;
    }
}