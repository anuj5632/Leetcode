class Solution {
    public int product(int n){
        int product = 1;
        while(n != 0){
            int d = n%10;
            product *= d;
            n = n/10;
        }
        return product;
    }
    public int smallestNumber(int n, int t) {
        int ans = n;
        while(ans > 0){ 
            if(product(ans) % t == 0){
                return ans;
            }
            else{
                ans += 1;
            }
        }
        return -1;
    }
}