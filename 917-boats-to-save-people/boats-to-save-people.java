class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        Arrays.sort(people);
        int boats = 0;
        int left = 0;
        int right = n-1;
        while(left <= right){
            if((people[left] + people[right]) <= limit){
                left++;
            }
            right--;
            boats++;
        }
        return boats;
    }
}