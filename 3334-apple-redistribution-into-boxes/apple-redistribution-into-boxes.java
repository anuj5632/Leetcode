class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int boxes = 0;
        int appleCount = 0;
        for(int i = 0;i<apple.length;i++){
            appleCount += apple[i];
        }
        Arrays.sort(capacity);

        for(int i = capacity.length - 1;i>=0 && appleCount > 0;i--){
            appleCount -= capacity[i];
            boxes++;
        }

        return boxes;
    }
}