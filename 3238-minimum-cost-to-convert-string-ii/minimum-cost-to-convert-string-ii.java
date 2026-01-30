class Solution {
    class pairDuo{
        String str;
        long cst;
        public pairDuo(String str, long cst){
            this.str = str;
            this.cst = cst;
        }
    }

    int len;
    HashMap<String, HashMap<String, Long>> allPossComb;
    HashMap<String, ArrayList<pairDuo>> adj;
    Long[] dp;
    public long minimumCost(String source, String target, String[] original, String[] changed, int[] cost) {
        adj = new HashMap<>();
        allPossComb = new HashMap<>();
        len = original.length;
        for(int i = 0; i < len; i++){
            if(!adj.containsKey(original[i])){
                adj.put(original[i], new ArrayList<>());
            }
            adj.get(original[i]).add(new pairDuo(changed[i], cost[i]));
        }

        len = source.length();
        dp = new Long[len+1];

        long res = allPossible(source, target, 0);

        return res == Long.MAX_VALUE ? -1 : res;
    }
    public long allPossible(String source, String target, int ind){
        if(ind >= source.length()) return 0;
        if(dp[ind] != null) return dp[ind];

        long ans = Long.MAX_VALUE;
        if(source.charAt(ind) == target.charAt(ind)){
            long cost = allPossible(source, target, ind+1);
            if(cost != Long.MAX_VALUE) ans = Math.min(ans, cost);
        }

        for(String key : adj.keySet()){
            int sz = key.length();
            if(ind+sz <= len && source.startsWith(key, ind)){
                String tar = target.substring(ind, ind+sz);
                if(!allPossComb.containsKey(key)){
                    allPossComb.put(key, shortPath(key));
                }

                HashMap<String, Long> comb = allPossComb.get(key);

                if(comb.containsKey(tar)){
                    long cost = comb.get(tar);
                    long temp = allPossible(source, target, ind+sz);
                    if(temp != Long.MAX_VALUE){
                        ans = Math.min(ans, temp+cost);
                    }
                }
                else if(key.equals(tar)){
                    long tmp = allPossible(source, target, ind+sz);
                    if(tmp != Long.MAX_VALUE){
                        ans = Math.min(ans, tmp);
                    }
                }
            }
        }

        return dp[ind] = ans;
    }

    public HashMap<String, Long> shortPath(String node){
        HashMap<String, Long> best = new HashMap<>();
        PriorityQueue<pairDuo> pq = new PriorityQueue<>((a,b) -> Long.compare(a.cst,b.cst));
        pq.add(new pairDuo(node, 0));
        best.put(node, 0L);

        while(!pq.isEmpty()){
            pairDuo temp = pq.poll();
            String src = temp.str;
            long cost = temp.cst;

            if(!adj.containsKey(src)) continue;
            for(pairDuo tmp : adj.get(src)){
                long tempCst = tmp.cst + cost;
                if(!best.containsKey(tmp.str) || best.get(tmp.str) > tempCst){
                    best.put(tmp.str, tempCst);
                    pq.add(new pairDuo(tmp.str, tempCst));
                }
            }
        }

        return best;
    }
}