class Solution {
    public int[] minBitwiseArray(java.util.List<Integer> nums) {
        int[] res = new int[nums.size()];

        for (int i = 0; i < nums.size(); i++) {
            int n = nums.get(i);

            if ((n & 1) == 0) {
                res[i] = -1;
                continue;
            }

            int firstZeroBit = (n + 1) & (~n);
            int maskBit = firstZeroBit >> 1;
            res[i] = n & (~maskBit);
        }

        return res;
    }
}
