class Solution {
    public int countPrimes(int n) {
    if(n <= 2){
        return 0;
    }

    boolean[] composite = new boolean[n];
    int count = 1; 

    for(int i = 3; i < n; i += 2){
        if(!composite[i]){
            count++;
            if((long) i * i < n){
                for(int j = i * i; j < n; j += 2 * i){
                    composite[j] = true;
                }
            }
        }
    }
    return count;
}

    // public int countPrimes(int n) {
    //     int count = 0;
    //     for(int i = 2; i < n; i++){
    //         if(isPrime(i)){
    //             count++;
    //         }
    //     }
    //     return count;
    // }
}
