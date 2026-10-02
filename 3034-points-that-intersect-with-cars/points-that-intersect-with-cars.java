class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int n = nums.size();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i < n;i++){
            int start = nums.get(i).get(0);
            int end = nums.get(i).get(1);
            for(int j = start;j <= end;j++){
                set.add(j);
            }
        }

        return set.size();
    }
}