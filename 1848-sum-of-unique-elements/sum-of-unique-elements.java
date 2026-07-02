class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int sum = 0;
        for(int i = 0;i<n;i++){
                map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
        }

        for(int num : map.keySet()){
            if(map.get(num) == 1){
                sum += num;
            }
        }

        return sum;
    }
}