class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int maxDist = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                if(colors[i] != colors[j]){
                    int dist = Math.abs(i - j);
                    maxDist = Math.max(maxDist,dist);
                }
                else{
                    continue;
                }
            }
        }
        return maxDist;
    }
}