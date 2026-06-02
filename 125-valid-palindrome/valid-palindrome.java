class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = cleaned.length();
        int left = 0;
        int right = n-1;
        while(left < right){
            if(cleaned.charAt(left) != (cleaned.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}