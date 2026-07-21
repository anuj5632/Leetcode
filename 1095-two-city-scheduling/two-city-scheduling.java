class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a, b) -> (a[1] - a[0]) - (b[1] - b[0]));
        int n = costs.length / 2;
        int cost = 0;
        
        for(int i = 0; i < n; i++){
            cost += costs[i][1]; 
        }
        for(int i = n; i < 2 * n; i++){
            cost += costs[i][0];     
        }
        return cost;
    }
}