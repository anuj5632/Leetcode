class Solution {
    public int bestClosingTime(String customers) {
       int totalY = 0;
       for(int i = 0;i<customers.length();i++){
        if(customers.charAt(i) == 'Y'){
            totalY ++;
        }
       }

       int minPenalty = totalY;
       int best = 0;
       int penalty = totalY;

       for(int i = 0;i<customers.length();i++){
        if(customers.charAt(i) == 'Y'){
            penalty --;
        }
        else{
            penalty ++;
        }
        if(penalty < minPenalty){
            minPenalty = penalty;
            best = i+1;
        }
       }
       return best;
    }
}