class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int k = primes.length;
        long[] ugly = new long[n];
        ugly[0] = 1;
        int[] ptr = new int[k];
        long[] next = new long[k];
        for(int i = 0; i < k; i++){
            next[i] = primes[i];
        }

        for(int i = 1; i < n; i++){
            long min = next[0];

            for(int j = 1; j < k; j++){
                min = Math.min(min, next[j]);
            }

            ugly[i] = min;

            for(int j = 0; j < k; j++){
                if(next[j] == min){
                    ptr[j]++;
                    next[j] = ugly[ptr[j]] * primes[j];
                }
            }
        }
        return (int) ugly[n - 1];
    }
}