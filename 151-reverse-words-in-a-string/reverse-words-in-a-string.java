class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        String[] words = s.trim().split("\\s+");

        StringBuilder ans = new StringBuilder();
        int m = words.length;
        for(int i = m - 1;i >= 0;i--){
            ans.append(words[i]);

            if(i != 0){
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}