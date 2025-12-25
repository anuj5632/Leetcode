class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n = happiness.length;
        Long sum = 0L;
        int done=0;
        Arrays.sort(happiness);
        for(int i = n-1;i >= 0;i--){
            if(k==0) break;
            if(k > 0){
                if(happiness[i]-done>0){
                sum += (happiness[i]-done);
                done++;
            }
            }
            
            k--;
        }
        return sum;
    }
}