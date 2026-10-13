class Solution {
    public int flipgame(int[] fronts, int[] backs) {
        int n = fronts.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<n;i++){
            if(fronts[i] == backs[i]){
                set.add(fronts[i]);
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            if(!set.contains(fronts[i])){
                min = Math.min(min,fronts[i]);
            }
            if(!set.contains(backs[i])){
                min = Math.min(min,backs[i]);
            }
        }

        if(min == Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
}