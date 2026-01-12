class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int n = points.length;
        int dist = 0;
        for(int i = 0;i<n-1;i++){
            int ver = 0;
            int hor = 0;
            hor = Math.abs(points[i][0] - points[i+1][0]);
            ver = Math.abs(points[i][1] - points[i+1][1]);
            dist += Math.max(hor,ver);
        }
        return dist;
    }
}