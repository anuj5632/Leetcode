class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i = 0;i<n;i++){
            map.put(intervals[i][0],i);
        }

        int[] ans = new int[n];
        for(int i = 0;i<n;i++){
            Integer next = map.ceilingKey(intervals[i][1]);
            if(next == null){
                ans[i] = -1;
            }
            else{
                ans[i] = map.get(next);
            }
        }
        return ans;
    }
}