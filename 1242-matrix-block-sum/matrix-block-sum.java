class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] ans = new int[n][m];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                int sum = 0;
                for(int p = Math.max(0,i-k);p <= i+k && p < n;p++){
                    for(int q = Math.max(0,j-k);q <= j+k && q < m;q++){
                        sum += mat[p][q];
                    }
                }
                ans[i][j] = sum;
            }
        }

        return ans;
    }
}