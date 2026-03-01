class Solution {
    public int minPartitions(String n) {
        int len = n.length();
        int max = 0;
        for(int i = 0;i<len;i++){
            int curr = (int)n.charAt(i)-'0';
            if(curr > max){
                max = curr;
            }
        }
        return max;
    }
}