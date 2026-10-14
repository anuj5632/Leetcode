class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int n = points.length;
        int count = 0;
        if(n < 3){
            return 0;
        }
        for(int i = 0;i<n;i++){
            HashMap<Long,Integer> map = new HashMap<>();
            for(int j = 0;j<n;j++){
                if(j == i){
                    continue;
                }
                int x = points[i][0] - points[j][0];
                int y = points[i][1] - points[j][1];

                long dist = x*x + y*y;
                map.put(dist,map.getOrDefault(dist,0)+1);

            }
            for(Map.Entry<Long,Integer> u : map.entrySet()){
                int k = u.getValue();
                if(k > 1){
                    count += k*(k-1);
                }

            }
        }
        return count;
    }
}