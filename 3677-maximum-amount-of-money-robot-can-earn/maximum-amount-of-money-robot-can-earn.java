class Solution {
    int[][][] dp;

    public int func(int[][] coins,int i,int j,int k){
        int m=coins.length,n=coins[0].length;
        if(i>=m||j>=n){
            return Integer.MIN_VALUE;
        }
        if(i==m-1&&j==n-1){
            if(coins[i][j]<0 && k>0){
                return 0;
            }
            return coins[i][j];
        }
        if(dp[i][j][k]!=Integer.MIN_VALUE)return dp[i][j][k];
        int right=func(coins,i,j+1,k);
        int down=func(coins,i+1,j,k);
        int best=Math.max(right,down);
        int ans;
        if(coins[i][j]>=0){
            ans=coins[i][j]+best;
        }else{
            int takeLoss=coins[i][j]+best;
            int neutralize=Integer.MIN_VALUE;
            if(k>0){
                int right2=func(coins,i,j+1,k-1);
                int down2=func(coins,i+1,j,k-1);
                neutralize=Math.max(right2,down2);
            }
            ans=Math.max(takeLoss,neutralize);
        }
        return dp[i][j][k]=ans;
    }

    public int maximumAmount(int[][] coins){
        int m=coins.length,n=coins[0].length;
        dp=new int[m][n][3];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<3;k++){
                    dp[i][j][k]=Integer.MIN_VALUE;
                }
            }
        }
        return func(coins,0,0,2);
    }
}