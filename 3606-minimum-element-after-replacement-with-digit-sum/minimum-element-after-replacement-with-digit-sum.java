class Solution {
    public int sum(int n){
        int sum = 0;
        while(n > 0){
            int d = n%10;
            sum+=d;
            n = n/10;
        }
        return sum;
    }
    public int minElement(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sum(nums[i]);
        }
        Arrays.sort(arr);
        return arr[0];
    }
}