class Solution {
    public int minFlips(String s) {
        int n = s.length();
        String ss = s + s;

        int diff1 = 0;
        int diff2 = 0;
        int res = Integer.MAX_VALUE;

        for (int i = 0; i < ss.length(); i++){

            char expected1;
            char expected2;

            if(i % 2 == 0){
                expected1 = '0';
                expected2 = '1';
            }
            else {
                expected1 = '1';
                expected2 = '0';
            }

            if(ss.charAt(i) != expected1){
                diff1++;
            }
            if(ss.charAt(i) != expected2){
                diff2++;
            }

            if(i >= n){
                char prev = ss.charAt(i - n);

                char prevExpected1;
                char prevExpected2;

                if((i - n) % 2 == 0){
                    prevExpected1 = '0';
                    prevExpected2 = '1';
                }
                else{
                    prevExpected1 = '1';
                    prevExpected2 = '0';
                }

                if(prev != prevExpected1){
                    diff1--;
                }
                if(prev != prevExpected2){
                    diff2--;
                }
            }

            if(i >= n - 1){
                res = Math.min(res, Math.min(diff1, diff2));
            }
        }

        return res;
    }
}