class Solution {
    public int sumD(int n){
        int sum = 0;
        while(n != 0){
            int d = n%10;
            sum += d;
            n = n/10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        int minI = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            if(i == sumD(nums[i])){
                minI = Math.min(minI,i);
            }
        }
        if(minI >= n){
            return -1;
        }

        return minI;
    }
}