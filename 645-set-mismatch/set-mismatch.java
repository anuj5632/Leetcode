class Solution {
    public int[] findErrorNums(int[] nums) {
       int n = nums.length;
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i = 0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
       }
       int misI = 0;
       for(int i = 1;i <= n;i++){
            if(!map.containsKey(i)){
                misI = i;
            }
       }

       int dup = 0;

       for(int i : map.keySet()){
            if(map.get(i) >= 2){
                dup = i;
            }
       } 
       
       int[] ans = new int[2];
       ans[0] = dup;
       ans[1] = misI;

       return ans;
    }
}