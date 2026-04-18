class Solution {
    Map<Integer,Boolean> memo = new HashMap<>();
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        int max = maxChoosableInteger;
        if(desiredTotal == 0){
            return true;
        }
        int totalSum = (max)*(max + 1)/2;
        if(totalSum < desiredTotal){
            return false;
        }

        return dfs(0,desiredTotal,max);
    }
    public boolean dfs(int mask,int remain,int max){
        if(memo.containsKey(mask)){
            return memo.get(mask);
        }

        for(int i = 1;i <= max;i++){
            int bit = 1 << (i-1);

            if((mask & bit) == 0){
                if(i >= remain){
                    memo.put(mask,true);
                    return true;
                }

                if(!dfs(mask | bit,remain-i,max)){
                    memo.put(mask,true);
                    return true;
                }
            }
        }
        memo.put(mask,false);
        return false;
    }

}