class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        for(int i = 0;i+2<n;i++){
            for(int j = 0;j+2<m;j++){
                if(isMagic(grid,i,j)){
                    count++;
                }
            }
        }
        return count;
    }

    public boolean isMagic(int[][] grid,int r,int c){
        boolean[] seen = new boolean[10];
        for(int i = r;i<r+3;i++){
            for(int j = c;j<c+3;j++){
                int val = grid[i][j];
                if(val < 1 || val > 9 || seen[val]){
                    return false;
                }
                seen[val] = true;
            }
        }

        int sum = grid[r][c] + grid[r][c+1] + grid[r][c+2];

        for(int i = 0;i<3;i++){
            if(grid[r + i][c] + grid[r + i][c + 1] + grid[r + i][c + 2] != sum){
                return false;
            }
            if(grid[r][c + i] + grid[r + 1][c + i] + grid[r + 2][c + i] != sum){
                return false;
            }
        }
        if(grid[r][c] + grid[r + 1][c + 1] + grid[r + 2][c + 2] != sum){
                return false;
        }
        if(grid[r][c + 2] + grid[r + 1][c + 1] + grid[r + 2][c] != sum){
                return false;
        }
        return true;
    }
}