class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int minDist = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            if(words[i].equals(target)){
                int diff = Math.abs(i - startIndex);
                int circularDist = Math.min(diff, n - diff);
                minDist = Math.min(minDist, circularDist);
            }
        }
        if(minDist == Integer.MAX_VALUE){
            return -1;
        }
        else{
            return minDist;
        }
    }
}