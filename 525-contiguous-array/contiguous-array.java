class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int balance = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {

            if(nums[i] == 0){
                balance = balance - 1;
            }
            else{
                balance = balance + 1;
            }

            if(map.containsKey(balance)){
                int len = i - map.get(balance);
                if (len > maxLen){
                    maxLen = len;
                }
            }
            else{
                map.put(balance, i);
            }
        }
        return maxLen;
    }
}