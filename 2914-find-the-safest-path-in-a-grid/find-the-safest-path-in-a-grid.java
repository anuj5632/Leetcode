class Solution {
    static final int[][] dirs = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public int maximumSafenessFactor(List<List<Integer>> A) {
        int n = A.size();

        if (A.get(0).get(0) == 1 || A.get(n - 1).get(n - 1) == 1) {
            return 0;
        }

        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A.get(i).get(j) == 1) {
                    q.add(new int[]{i, j});
                }
            }
        }

        while (!q.isEmpty()) {
            int[] head = q.poll();
            int i = head[0];
            int j = head[1];

            int v = A.get(i).get(j);

            for (int[] d : dirs) {
                int x = i + d[0];
                int y = j + d[1];

                if (Math.min(x, y) >= 0 && Math.max(x, y) < n && A.get(x).get(y) == 0) {
                    A.get(x).set(y, v + 1);
                    q.add(new int[]{x, y});
                }
            }
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        pq.add(new int[]{A.get(0).get(0), 0, 0});
        A.get(0).set(0, -A.get(0).get(0));

        while (!pq.isEmpty()) {
            int[] head = pq.poll();
            int sf = head[0];
            int i = head[1];
            int j = head[2];

            if (i == n - 1 && j == n - 1) {
                return sf - 1;
            }

            for (int[] d : dirs) {
                int x = i + d[0];
                int y = j + d[1];

                if (Math.min(x, y) >= 0 && Math.max(x, y) < n && A.get(x).get(y) > 0) {
                    pq.add(new int[]{Math.min(sf, A.get(x).get(y)), x, y});
                    A.get(x).set(y, -A.get(x).get(y));
                }
            }
        }

        return A.get(n - 1).get(n - 1) - 1;
    }
}