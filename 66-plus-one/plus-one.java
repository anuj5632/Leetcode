class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        //int[] arr = new int[n+1];
        for(int i = n-1;i>=0;i--){
            if(digits[i] >= 0 && digits[i] <= 8){
                digits[i] = digits[i] + 1;
                return digits;
            }
            else{
                digits[i] = 0;
            }
        }
        digits = new int[n+1];
        digits[0] = 1;
        return digits;

    }
}