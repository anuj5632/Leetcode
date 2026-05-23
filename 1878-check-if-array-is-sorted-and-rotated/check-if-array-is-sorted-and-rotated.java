class Solution {
    public boolean isSorted(int[] rot){
        for(int i = 1;i<rot.length;i++){
            if(rot[i] < rot[i-1]){
                return false;
            }
        }
        return true;
    }
    public boolean check(int[] nums) {
        int n = nums.length;
        int x = n-1;
        int[] rot = new int[n];
        while(x >= 0){
            for(int i = 0;i<n;i++){
                rot[i] = nums[(i+x)%n];
            }
            if(isSorted(rot)){
                return true;
            }
            x--;
        }
        return false;
    }
}