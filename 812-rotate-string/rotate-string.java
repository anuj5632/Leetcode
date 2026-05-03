class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        int m = goal.length();
        if( n != m){
            return false;
        }
        String d = s+s;
        if(d.contains(goal)){
            return true;
        }
        else{
            return false;
        }
    }
}