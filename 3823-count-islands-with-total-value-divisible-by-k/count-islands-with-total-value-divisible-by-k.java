class Solution {
    public long dfs(int r,int c,int[][] grid,boolean[][] vis){
        int m = grid.length;
        int n = grid[0].length;
        if(r<0 || c<0 || r >= m || c >= n || grid[r][c] == 0 || vis[r][c]){
            return 0;
        }

        vis[r][c] = true;
        long sum = grid[r][c];

        sum += dfs(r+1,c,grid,vis);
        sum += dfs(r-1,c,grid,vis);
        sum += dfs(r,c+1,grid,vis);
        sum += dfs(r,c-1,grid,vis);

        return sum;
    }
    public int countIslands(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        boolean[][] vis = new boolean[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] != 0 && !vis[i][j]){
                    long sum = dfs(i,j,grid,vis);
                    if(sum % k == 0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}