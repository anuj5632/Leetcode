class Solution {
    public int checkLives(int row, int col, int[][] board){
        int n = board.length;
        int m = board[0].length;

        int[][] dirs ={
            {-1,-1}, {-1,0}, {-1,1},
            {0,-1},          {0,1},
            {1,-1},  {1,0},  {1,1}
        };

        int lives = 0;

        for(int[] dir : dirs){
            int nr = row + dir[0];
            int nc = col + dir[1];

            if(nr >= 0 && nr < n && nc >= 0 && nc < m){
                if(board[nr][nc] == 1){
                    lives++;
                }
            }
        }

        return lives;
    }

    public void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;

        int[][] next = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++) {

                int lives = checkLives(i, j, board);

                if(board[i][j] == 1){
                    if(lives < 2 || lives > 3){
                        next[i][j] = 0;
                    }
                    else{
                        next[i][j] = 1;
                    }
                }
                else{
                    if (lives == 3) {
                        next[i][j] = 1;
                    }
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                board[i][j] = next[i][j];
            }
        }
    }
}