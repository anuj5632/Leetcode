class Solution {
    public boolean check(int start,int n,int[][] graph,int[] color){
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(start);
        color[start] = 0;
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            for(int it : graph[node]){
                if(color[it] == -1){
                    color[it] = 1 - color[node];
                    q.add(it);
                }
                else if(color[it] == color[node]){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] vis = new int[n];
        for(int i = 0;i<n;i++){
            vis[i] = -1;
        }

        for(int i = 0;i<n;i++){
            if(vis[i] == -1){
                if(!check(i,n,graph,vis)){
                    return false;
                }
            }
        }
    return true;
    }
}