class Solution {
    public int countVowelStrings(int n){
        return helper(n, 0);
    }

    int helper(int n, int index){
        if (n == 0){
            return 1;
        }

        int count = 0;

        for(int i = index; i < 5; i++){
            count += helper(n - 1, i);
        }

        return count;
    }
}