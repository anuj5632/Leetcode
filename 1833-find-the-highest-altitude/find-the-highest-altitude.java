class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] height = new int[n+1];
        height[0] = 0;
        int maxGain = 0;
        for(int i = 1;i<height.length;i++){
            height[i] = height[i-1] + gain[i-1];
            maxGain = Math.max(maxGain,height[i]);
        }
        return maxGain;
    }
}