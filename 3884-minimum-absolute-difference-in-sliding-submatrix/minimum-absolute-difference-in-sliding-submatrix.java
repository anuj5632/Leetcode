class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] ans = new int[m - k + 1][n - k + 1];

        if(k == 1) return ans;

        for(int i = 0; i <= m - k; i++){
            for(int j = 0; j <= n - k; j++){

                List<Integer> list = new ArrayList<>();

                for(int x = 0; x < k; x++){
                    for(int y = 0; y < k; y++){
                        list.add(grid[i + x][j + y]);
                    }
                }

                Collections.sort(list);

                int minDiff = Integer.MAX_VALUE;

                for(int p = 1; p < list.size(); p++){
                    if(!list.get(p).equals(list.get(p - 1))){
                        int diff = list.get(p) - list.get(p - 1);
                        if(diff < minDiff) {
                            minDiff = diff;
                        }
                    }
                }

                if(minDiff == Integer.MAX_VALUE){
                    minDiff = 0;
                }

                ans[i][j] = minDiff;
            }
        }

        return ans;
    }
}