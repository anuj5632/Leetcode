class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] hash = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLen = 0;
        for(int right = 0; right < n; right++){
            hash[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, hash[s.charAt(right) - 'A']);

            while((right - left + 1) - maxFreq > k){
                hash[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}