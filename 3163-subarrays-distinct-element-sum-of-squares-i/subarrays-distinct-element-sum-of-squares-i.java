class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0;i<n;i++){
            ArrayList<Integer> subList = new ArrayList<>();
            for(int j = i;j<n;j++){
                subList.add(nums.get(j));
                list.add(new ArrayList<>(subList));
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0;i<list.size();i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j = 0;j<list.get(i).size();j++){
                set.add(list.get(i).get(j));
            }
            ans[i] = set.size();
        }
        int score = 0;
        for(int i = 0;i<ans.length;i++){
            score += ans[i]*ans[i];
        }

        return score;
    }
}