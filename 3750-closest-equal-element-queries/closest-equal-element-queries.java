class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length;

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        List<Integer> ans = new ArrayList<>();

        for(int q : queries){

            int val = nums[q];
            List<Integer> list = map.get(val);

            if(list.size() == 1){
                ans.add(-1);
                continue;
            }

            int idx = Collections.binarySearch(list, q);
            int size = list.size();

            int left = list.get((idx - 1 + size) % size);
            int right = list.get((idx + 1) % size);

            int minDist = Math.min(
                circularDist(q, left, n),
                circularDist(q, right, n)
            );

            ans.add(minDist);
        }

        return ans;
    }

    private int circularDist(int i, int j, int n){
        int diff = Math.abs(i - j);
        return Math.min(diff, n - diff);
    }
}