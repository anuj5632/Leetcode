class Solution {
    public int numRabbits(int[] answers) {
        int n = answers.length;
        int total = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            map.put(answers[i],map.getOrDefault(answers[i],0)+ 1);
        }
        for(int x : map.keySet()){
            int f = map.get(x);
            int groupsize = x + 1;

            int groups = (f + groupsize - 1)/groupsize;
            total += groups*groupsize;
        }
        return total;
    }
}