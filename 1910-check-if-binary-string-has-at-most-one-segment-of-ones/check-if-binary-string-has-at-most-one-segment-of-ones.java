class Solution {
    public boolean checkOnesSegment(String s) {
        boolean zero = false;
        if(s.length() == 1 || s.length() == 2){
            return true;
        }

        for( char c : s.toCharArray()){
            if(c == '0'){
                zero = true;
            }
            else if(zero){
                return false;
            }
        }
        return true;
    }
}