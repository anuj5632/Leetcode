class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0;
        int n = haystack.length();
        if(n == 1){
            if(needle.equals(haystack)){
                return 0;
            }
            else{
                return -1;
            }
        }
        while(i < n){
            String s = haystack.substring(i,n);
            if(s.startsWith(needle)){
                return i;
            }
            i++;
        }
        return -1;
    }
}