class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length;
        int m = mat[0].length;
        if(r == n && c == m){
            return mat;
        }
        int[][] res = new int[r][c];
        if(r*c != n*m){
            return mat;
        }

        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                st.push(mat[i][j]);
            }
        }

        for(int i = r-1;i >= 0;i--){
            for(int j = c-1;j >= 0;j--){
                res[i][j] = st.pop();
            }
        }

        return res;

    }
}