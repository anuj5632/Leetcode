class Solution {
    public boolean isSubsequence(String s,String t){
        int i = 0;
        int j = 0;
        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }

        return i == s.length();
    }
    public int numMatchingSubseq(String s, String[] words) {
        HashMap<String, Boolean> memo = new HashMap<>();

        int count = 0;

        for(String word : words){
            if(!memo.containsKey(word)){
                memo.put(word, isSubsequence(word, s));
            }
            if(memo.get(word)){
                count++;
            }
        }
        return count;
    }
}