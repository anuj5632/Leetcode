class Solution {
    public boolean scoreBalance(String s) {
        int n = s.length();
        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            char ch = s.charAt(i);
            arr[i] = ch - 'a' + 1;;
        }

        int i = 0;
        while(i < n){
            int left = 0;
            for(int j = 0;j <= i;j++){
                left += arr[j];
            }

            int right = 0;
            for(int j = i+1;j < n;j++){
                right += arr[j];
            }

            if(left == right){
                return true;
            }
            i++;
        }

        return false;
    }
}