class Solution {
    public int countBits(int num){
        int count = 0;
        String binary = Integer.toBinaryString(num);
        for(int i = 0;i<binary.length();i++){
            if(binary.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-i-1;j++){
                if(countBits(arr[j]) > countBits(arr[j+1])){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
                else if(countBits(arr[j]) == countBits(arr[j+1])){
                    continue;
                }
            }
        }
        return arr;
    }
}