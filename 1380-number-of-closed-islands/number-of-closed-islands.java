class Solution {
    public int closedIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        for(int i = 0;i<n;i++){
            dfs(grid,i,0);
            dfs(grid,i,m-1);
        }

        for(int i = 0;i<m;i++){
            dfs(grid,0,i);
            dfs(grid,n-1,i);
        }

        for(int i = 0;i<n-1;i++){
            for(int j = 0;j<m-1;j++){
                if(grid[i][j] == 0){
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }

    public void dfs(int[][] grid,int r,int c){
        int n = grid.length;
        int m = grid[0].length;

        if(r < 0 || c < 0 || r >= n || c >= m || grid[r][c] == 1){
            return;
        }

        grid[r][c] = 1;

        dfs(grid,r+1,c);
        dfs(grid,r,c+1);
        dfs(grid,r-1,c);
        dfs(grid,r,c-1);
    }
}