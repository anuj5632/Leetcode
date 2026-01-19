class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        int m = mat.length;
        int n = mat[0].length;

        long[][] pref = new long[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                pref[i][j] = mat[i - 1][j - 1] + pref[i - 1][j] + pref[i][j - 1] - pref[i - 1][j - 1];
            }
        }

        int side = Math.min(m, n);
        int ans = 0;

        while (side > 0) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (i + side <= m && j + side <= n) {
                        if (isValid(pref, threshold, i, j, side) && side > ans){
                            ans = side;
                        }
                    }
                }
            }
            if (ans == side){
                break;
            }
            side--;
        }
        return ans;
    }

    public boolean isValid(long[][] pref, int threshold, int i, int j, int side) {
        int r1 = i, c1 = j;
        int r2 = i + side, c2 = j + side;
        long sum = pref[r2][c2] - pref[r1][c2] - pref[r2][c1] + pref[r1][c1];
        return (sum <= threshold);
    }
}
