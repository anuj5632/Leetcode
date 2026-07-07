class Solution {
    public long sumAndMultiply(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        while(n != 0){
            int i = n % 10;
            if(i != 0){
                list.add(i);
            }
            n = n/10;
        }
        Collections.reverse(list);
        long sum = 0;
        long num = 0;
        for(int i = 0;i<list.size();i++){
            sum += list.get(i);
            num = num*10 + list.get(i);
        }

        return num*sum;
    }
}