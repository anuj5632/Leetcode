class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        int n = jewels.length();
        int m = stones.length();
        int count = 0;
        for(int i = 0;i<n;i++){
            set.add(jewels.charAt(i));
        }

        for(int i = 0;i<m;i++){
            if(set.contains(stones.charAt(i))){
                count++;
            }
        }
        return count;
    }
}