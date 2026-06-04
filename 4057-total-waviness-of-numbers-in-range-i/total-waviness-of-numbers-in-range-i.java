class Solution {
    public int waviness(int n){
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        while(n > 0){
            int d = n % 10;
            list.add(d);
            n = n / 10;
        }
        int m = list.size();
        int i = 1;
        while(i < m-1){
            int prev = list.get(i - 1);
            int curr = list.get(i);
            int next = list.get(i + 1);
            if((curr > prev && curr > next) || (curr < prev && curr < next)){
                count++;
            }
            i++;
        }
        return count;
    }
    public int totalWaviness(int num1, int num2) {
        int count = 0;
        for(int i = num1;i<=num2;i++){
            count += waviness(i);
            
        }
        return count;
    }
}