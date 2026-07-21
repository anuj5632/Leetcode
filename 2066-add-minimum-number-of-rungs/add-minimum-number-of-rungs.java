class Solution {
    public int addRungs(int[] rungs, int dist) {
        int n = rungs.length;
        int height = 0;
        int count = 0;
        for(int i = 0;i<n;i++){
            if((rungs[i] - height) > dist){
                int diff = rungs[i] - height;
                count += (diff-1) / dist;
            }
            height = rungs[i];
        }
        return count;
    }
}