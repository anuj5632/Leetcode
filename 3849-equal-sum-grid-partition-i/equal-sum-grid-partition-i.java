class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        long total = 0;
        int[] r = new int[m];
        int[] c = new int[n];

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                total += grid[i][j];
            }
        }

        for(int i = 0;i < m;i++){
            int sum = 0;
            for(int j = 0;j<n;j++){
                sum += grid[i][j];
            }
            r[i] = sum;
        }
        long prefixR = 0;
        for(int i = 0;i<m;i++){
            prefixR += r[i];
            if(prefixR == total - prefixR){
                return true;
            }
        }

        for(int i = 0;i<n;i++){
            int sum = 0;
            for(int j = 0;j<m;j++){
                sum += grid[j][i];
            }
            c[i] = sum;
        }
        long prefixC = 0;
        for(int i = 0;i<n;i++){
            prefixC += c[i];
            if(prefixC == total - prefixC){
                return true;
            }
        }
        return false;
    }
}