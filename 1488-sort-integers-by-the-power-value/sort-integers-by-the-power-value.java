class Solution {

    Map<Integer, Integer> map = new HashMap<>();

    public int func(int n) {
        if (n == 1) {
            return 0;
        }

        if (map.containsKey(n)) {
            return map.get(n);
        }

        int steps;

        if (n % 2 == 0) {
            steps = 1 + func(n / 2);
        } else {
            steps = 1 + func(3 * n + 1);
        }

        map.put(n, steps);
        return steps;
    }

    public int getKth(int lo, int hi, int k) {
        List<int[]> list = new ArrayList<>();

        for (int i = lo; i <= hi; i++) {
            int power = func(i);
            list.add(new int[]{i, power});
        }

        Collections.sort(list, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[1] < b[1]) {
                    return -1;
                } else if (a[1] > b[1]) {
                    return 1;
                } else {
                    return a[0] - b[0];
                }
            }
        });

        return list.get(k - 1)[0];
    }
}