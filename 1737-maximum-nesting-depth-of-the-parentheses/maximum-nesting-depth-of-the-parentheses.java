class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int count = 0;
        int maxC = 0;
        for(int i = 0;i<n;i++){
            if(s.charAt(i) == '('){
                count++;
                maxC = Math.max(count,maxC);
            }
            else if(s.charAt(i) == ')'){
                count--;
            }
            else{
                continue;
            }
        }
        return maxC;
    }
}