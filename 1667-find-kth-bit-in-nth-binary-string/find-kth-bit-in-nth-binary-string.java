class Solution {
    public String reverse(String s){
        String reversed = new StringBuilder(s).reverse().toString();
        return reversed;
    }
    public String invert(String s){
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<n;i++){
            if(s.charAt(i) == '1'){
                sb.append('0');
            }
            else{
                sb.append('1');
            }
        }
        return sb.toString();
    }
    public char findKthBit(int n, int k) {
        if(n == 1){
            return '0';
        }
        String s = "0";
        for(int i = 2;i<=n;i++){
            s = s + '1' + reverse(invert(s));
        }

        return s.charAt(k-1);
    }
}