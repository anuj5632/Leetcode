class Solution {
    public String largestOddNumber(String num) {
        int n1 = num.length();
        for(int i = n1-1;i>=0;i--){
            char c = num.charAt(i);
            int n = c - '0';
            if(n % 2 != 0){
                return num.substring(0,i+1);
            }
            else{
                continue;
            }
        }

        return "";
    }
}