class Solution {
    public int max(int left,int right,int[] arr){
        int max = 0;
        for(int i = left;i <= right;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int curr = 0;
        while(curr < n){
            if(curr == n-1){
                arr[n-1] = -1;
            }
            else{
                arr[curr] = max(curr+1,n-1,arr);
            }
            curr++;
        }

        return arr;
    }
}