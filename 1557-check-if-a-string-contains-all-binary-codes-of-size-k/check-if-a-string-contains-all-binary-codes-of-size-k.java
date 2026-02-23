class Solution {
    public boolean hasAllCodes(String s, int k) {
        int n = s.length();
        HashSet<String> set = new HashSet<>();
        for(int i = 0;i+k<=n;i++){
            set.add(s.substring(i,i+k));
        }

        return set.size() == (int)Math.pow(2,k);
    }
}