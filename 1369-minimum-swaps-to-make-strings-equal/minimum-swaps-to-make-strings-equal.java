class Solution {
    public int minimumSwap(String s1, String s2) {
        int n = s1.length();
        int countx = 0;
        int county = 0;
        for(int i = 0;i<n;i++){
            if(s1.charAt(i) == 'x' && s2.charAt(i) == 'y'){
                countx++;
            }
            if(s2.charAt(i) == 'x' && s1.charAt(i) == 'y'){
                county++;
            }
        }
        if(countx % 2 !=  county % 2){
            return -1;
        }
        int ans = countx / 2 + county / 2;
        if(countx % 2 == 1){
            ans += 2;
        }

        return ans;
    }
}