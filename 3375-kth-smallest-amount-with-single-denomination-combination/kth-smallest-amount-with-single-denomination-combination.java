class Solution {
    public long findKthSmallest(int[] coins, int k) {
        long left = 1;
        long right = (long) k * getMin(coins);

        while(left < right){
            long mid = left + (right - left) / 2;

            if(count(mid, coins) >= k){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }

        return left;
    }

    public long getMin(int[] coins){
        long min = Long.MAX_VALUE;

        for(int coin : coins){
            min = Math.min(min, coin);
        }

        return min;
    }

    public long count(long x, int[] coins){
        int n = coins.length;
        long result = 0;

        for(int mask = 1; mask < (1 << n); mask++){
            long lcm = 1;
            int bits = 0;
            boolean valid = true;

            for(int i = 0; i < n; i++){
                if((mask & (1 << i)) != 0){
                    bits++;

                    lcm = getLcm(lcm, coins[i]);

                    if(lcm > x){
                        valid = false;
                        break;
                    }
                }
            }

            if(!valid){
                continue;
            }

            long current = x / lcm;

            if(bits % 2 == 1){
                result += current;
            } 
            else{
                result -= current;
            }
        }

        return result;
    }

    public long getGcd(long a, long b){
        while(b != 0){
            long temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }

    public long getLcm(long a, long b){
        long gcd = getGcd(a, b);

        if(a > Long.MAX_VALUE / (b / gcd)){
            return Long.MAX_VALUE;
        }

        return a / gcd * b;
    }
}