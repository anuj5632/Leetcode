class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] rows = new int[m];
        int[] cols = new int[n];
        int countR = 0;
        int countC = 0;
        for(int[] i : indices){
            rows[i[0]]++;
            cols[i[1]]++;
        }

        for(int i = 0;i<m;i++){
            if(rows[i] % 2 != 0){
                countR++;
            }
        }

        for(int i = 0;i<n;i++){
            if(cols[i] % 2 != 0){
                countC++;
            }
        }

        return countR * (n - countC) + countC * (m - countR);

    }
}