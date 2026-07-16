class Solution {
    public int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int max = -1;
        int[] prefix = new int[n];
        for(int i = 0;i<n;i++){
            max = Math.max(max,nums[i]);
            prefix[i] = gcd(nums[i],max);
        }

        Arrays.sort(prefix);

        long sum = 0;
        int left = 0;
        int right = n-1;
        while(left < right){
            int num = gcd(prefix[left],prefix[right]);
            sum += num;
            left++;
            right--;
        }
        return sum;
    }
}