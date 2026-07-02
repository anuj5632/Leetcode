class Solution {
    public int hammingDistance(int x, int y) {
        int[] num1 = new int[32];
        int[] num2 = new int[32];

        int i = 0;
        int j = 0;

        while(x > 0){
            num1[i++] = x % 2;
            x = x/2;
        }

        while(y > 0){
            num2[j++] = y % 2;
            y = y/2;
        }

        int n = num2.length;
        int dist = 0;
        for(int k = 0;k<n;k++){
            if(num1[k] != num2[k]){
                dist++;
            }
        }

        return dist;
    }
}