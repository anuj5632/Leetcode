class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas = 0;
        int totalcost = 0;
        int n = gas.length;
        int m = cost.length;
        for(int i = 0;i < n;i++){
            totalgas += gas[i];
            totalcost += cost[i];
        }
        if(totalgas < totalcost){
            return -1;
        }
        int currgas = 0;
        int start = 0;

        for(int i = 0;i<n;i++){
            currgas += gas[i] - cost[i];
            if(currgas < 0){
                currgas = 0;
                start = i+1;
            }
        }
        return start;
    }
}