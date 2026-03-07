class Solution {

    public int integerReplacement(int n) {
        int count = 0;
        long t = n;
        while(t != 1){
        if( t % 2 == 0){
            t = t/2;
        }
        else if(t == 3 || t%4 == 1){
            t = t-1;
            
        }
        else{
            t = t+1;
        }
        count++;
    }
    return count;
    }
}