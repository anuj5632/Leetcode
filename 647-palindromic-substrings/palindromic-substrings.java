class Solution {
    public boolean isPalindrome(String s,int low,int high){
        while(low < high){
            if(s.charAt(low) != s.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;
        for (int low = 0; low < n; low++){
            for (int high = low; high < n; high++){
                if(isPalindrome(s, low, high)){
                    count++;
                }
            }
        }
        return count;
    }
}