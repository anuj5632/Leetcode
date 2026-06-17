class Solution {
    public char processStr(String s, long k) {
        int n = s.length();
        long[] len = new long[n];
        long curr = 0;

        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);

            if(ch == '*'){
                curr = Math.max(0, curr - 1);
            }else if(ch == '#'){
                curr *= 2;
            }
            else if (ch == '%') {

            }
            else{
                curr++;
            }

            len[i] = curr;
        }

        if (k >= curr) {
            return '.';
        }

        for(int i = n - 1; i >= 0; i--){
            char ch = s.charAt(i);

            long prevLen = (i == 0) ? 0 : len[i - 1];

            if(Character.isLetter(ch)){
                if(k == prevLen){
                    return ch;
                }
            }
            else if(ch == '#'){
                if(prevLen > 0 && k >= prevLen){
                    k -= prevLen;
                }
            }
            else if(ch == '%'){
                k = prevLen - 1 - k;
            }
        }
        return '.';
    }
}