class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int maxP = 0;
        while(n != 0){
            int d = n%10;
            list.add(d);
            n =n/10;
        }
        for(int i = 0;i<list.size();i++){
            for(int j = i+1;j<list.size();j++){
                int product = list.get(i) * list.get(j);
                maxP = Math.max(maxP,product);
            }
        }
        return maxP;
    }
}