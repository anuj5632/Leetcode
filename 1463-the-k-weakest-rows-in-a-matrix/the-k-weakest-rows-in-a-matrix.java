class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] ans = new int[n][2];
        for(int i = 0;i<n;i++){
            int count = 0;
            for(int j = 0;j<m;j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }
            ans[i][0] = count;
            ans[i][1] = i;
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(
        (a, b) -> {
        if (a[0] == b[0]) {
            return a[1] - b[1];
        }
        return a[0] - b[0];
    }
);

    for(int i = 0; i < n; i++){
            pq.offer(ans[i]);
        }

    int[] ans1 = new int[k];
    for(int i = 0; i < k; i++){
        ans1[i] = pq.poll()[1];
    }
    return ans1;
    }
}