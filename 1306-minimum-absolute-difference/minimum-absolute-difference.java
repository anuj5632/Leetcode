class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        int n = arr.length;

        int diff = arr[1] - arr[0];
        for(int i = 1; i < n - 1; i++){
            diff = Math.min(diff, arr[i + 1] - arr[i]);
        }

        for(int i = 0; i < n - 1; i++){
            int sub = arr[i + 1] - arr[i];
            if(sub == diff){
                list.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }

        return list;
    }
}
