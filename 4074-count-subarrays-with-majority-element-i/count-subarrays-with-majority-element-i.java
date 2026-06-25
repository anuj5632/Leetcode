class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int bal = n+1;

        int[] freq = new int[2*n + 2];
        int[] pref = new int[2*n + 2];

        freq[bal] = 1;
        pref[bal] = 1;

        int answer = 0;

        for(int num : nums){
            if(num == target){
                bal++;
            }
            else{
                bal--;
            }
            freq[bal]++;

            pref[bal] = pref[bal - 1] + freq[bal];

            answer += pref[bal-1];
        }
        return answer;
    }
}