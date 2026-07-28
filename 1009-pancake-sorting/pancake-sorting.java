class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> res = new ArrayList<>();
        for(int n = arr.length; n > 1; --n){
            int i = find(arr, n);
            if(i == n - 1){
                continue;
            }
            if(i != 0){
                res.add(i + 1);
                reverse(arr, 0, i);
            }
            res.add(n);
            reverse(arr, 0, n - 1);
        }
        return res;
    }
    private int find(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1; 
    }
    private void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}