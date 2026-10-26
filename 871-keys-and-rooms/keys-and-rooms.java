class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] vis = new boolean[n];
        dfs(0,rooms,vis);
        for(int i = 0;i<n;i++){
            if(!vis[i]){
                return false;
            }
        }
        return true;
    }

    public void dfs(int start,List<List<Integer>> rooms,boolean[] vis){
        vis[start] = true;
        for(Integer i : rooms.get(start)){
            if(!vis[i]){
                dfs(i,rooms,vis);
            }
        }
    }

}