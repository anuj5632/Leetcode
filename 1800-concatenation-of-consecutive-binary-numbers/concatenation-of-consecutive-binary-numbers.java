class Solution {
    public int concatenatedBinary(int n) {
        StringBuilder concat = new StringBuilder();
        int MOD = 1_000_000_007;
        long decimal = 0;
        for(int i = 1; i <= n; i++){
            concat.append(Integer.toBinaryString(i));
        }
        for(int i = 0; i < concat.length(); i++){
            decimal = (decimal * 2 + (concat.charAt(i) - '0')) % MOD;
        }

        return (int)decimal;
    }
}