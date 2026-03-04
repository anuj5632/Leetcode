class Solution {
     public boolean checkRowCol(int[][] matrix, int i, int j) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int col = 0; col < m; col++){
            if(col != j && matrix[i][col] != 0){
                return false;
            }
        }
        for (int row = 0; row < n; row++){
            if(row != i && matrix[row][j] != 0){
                return false;
            }
        }
        return true;
    }
    public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int count = 0;

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(checkRowCol(mat,i,j) && mat[i][j] == 1){
                    count++;
                }
            }
        }

        return count;
    }
}