class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(slidingWindow(answerKey,k,'T'),slidingWindow(answerKey,k,'F'));
    }

    public int slidingWindow(String str, int k, char target){
        int left = 0;
        int right = 0;
        int n = str.length();
        int maxlen = 0;

        while(right < n){
            char curr = str.charAt(right);
            while(curr != target && k == 0){
                if(str.charAt(left) != target){
                    k++;
                }
                left++;
            }
            if(curr != target){
                k--;
            }
            maxlen = Math.max(maxlen,right-left+1);
            right++;
        }
        return maxlen;
    }
}