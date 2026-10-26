class Solution {
    int m, n;

    public void dfs(int r, int c, char[][] board, boolean[][] vis) {
        if(r < 0 || c < 0 || r >= m || c >= n ||
            board[r][c] == 'X' || vis[r][c]){
            return;
        }

        vis[r][c] = true;

        dfs(r + 1, c, board, vis);
        dfs(r - 1, c, board, vis);
        dfs(r, c + 1, board, vis);
        dfs(r, c - 1, board, vis);
    }

    public void solve(char[][] board) {
        m = board.length;
        n = board[0].length;

        boolean[][] vis = new boolean[m][n];

        for(int i = 0; i < m; i++){
            if(board[i][0] == 'O' && !vis[i][0]) {
                dfs(i, 0, board, vis);
            }
            if (board[i][n - 1] == 'O' && !vis[i][n - 1]) {
                dfs(i, n - 1, board, vis);
            }
        }

        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O' && !vis[0][j]) {
                dfs(0, j, board, vis);
            }
            if (board[m - 1][j] == 'O' && !vis[m - 1][j]) {
                dfs(m - 1, j, board, vis);
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 'O' && !vis[i][j]){
                    board[i][j] = 'X';
                }
            }
        }
    }
}
