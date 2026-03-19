class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        int[][] countX=new int[n][m];
        int[][] countY=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int x=0;
                int y=0;

                if(grid[i][j]=='X'){
                    x=1;
                }
                else if(grid[i][j]=='Y'){
                    y=1;
                }
                countX[i][j]=x;
                countY[i][j]=y;
                
                if(i>0){
                    countX[i][j]+=countX[i-1][j];
                    countY[i][j]+=countY[i-1][j];
                }
                if(j>0){
                    countX[i][j]+=countX[i][j-1];
                    countY[i][j]+=countY[i][j-1];
                }
                if(i>0 && j>0){
                    countX[i][j]-=countX[i-1][j-1];
                    countY[i][j]-=countY[i-1][j-1];
                }
                if(countX[i][j]==countY[i][j] && countX[i][j]>0){
                    count++;
                }
            }
        }
        return count;
    }
}