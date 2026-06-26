class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<n;i++){
            if(!set.contains(candyType[i])){
                set.add(candyType[i]);
            }
        }
        int count = set.size();

        return Math.min(count,n/2);
    }
}