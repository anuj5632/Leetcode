class Solution {
    public int sum(int n){
        int sumN = 0;
        while(n != 0){
            int d = n%10;
            sumN += d;
            n = n/10;
        }
        return sumN;
    }

    public int prod(int n){
        int prodN = 1;
        while(n != 0){
            int d = n%10;
            prodN *= d;
            n = n/10;
        }
        return prodN;
    }
    public boolean checkDivisibility(int n) {
        int sum1 = sum(n);
        int prod1 = prod(n);
        int sum2 = sum1 + prod1;
        if(n % sum2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}