class Solution {
    public int dfs(int r,int c,int[][] grid,boolean[][] vis){
        int m = grid.length;
        int n = grid[0].length;
        if(r < 0 || c < 0 || r >= m || c >= n || grid[r][c] == 0 || vis[r][c]){
            return 0;
        }
        int area = grid[r][c];
        vis[r][c] = true;

        area += dfs(r+1,c,grid,vis);
        area += dfs(r-1,c,grid,vis);
        area += dfs(r,c+1,grid,vis);
        area += dfs(r,c-1,grid,vis);

        return area;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int maxArea = 0;
        boolean[][] vis = new boolean[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] != 0 && !vis[i][j]){
                    int area = dfs(i,j,grid,vis);
                    maxArea = Math.max(maxArea,area);
                }
            }
        }
        return maxArea;
    }
}