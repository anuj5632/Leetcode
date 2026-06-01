class Solution {
    public int minimumCost(int[] cost) {
        int n = cost.length;
        Arrays.sort(cost);
        int minCost = 0;
        int count = 0;
        for(int i = n-1;i>=0;i--){
            count++;
            if((count) % 3 == 0){
                continue;
            }
            minCost += cost[i];
        }

        return minCost;
    }
}