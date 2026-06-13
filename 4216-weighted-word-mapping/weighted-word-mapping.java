class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int n = words.length;
        StringBuilder ans = new StringBuilder();
        for(String s : words){
            int weight = 0;
            for(char c : s.toCharArray()){
                weight += weights[c - 'a'];
            }
            int remainder = weight % 26;
            ans.append((char)('z' - remainder));
        }
        return ans.toString();
    }
}