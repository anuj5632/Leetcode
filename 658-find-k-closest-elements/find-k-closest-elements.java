class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        int start = 0;
        int end = n-1;
        while(end - start >= k){
            if(Math.abs(arr[start] - x) > Math.abs(arr[end] - x)){
                start++;
            }
            else{
                end--;
            }
        }
        for(int i = start;i<=end;i++){
            list.add(arr[i]);
        }
        return list;
    }
}