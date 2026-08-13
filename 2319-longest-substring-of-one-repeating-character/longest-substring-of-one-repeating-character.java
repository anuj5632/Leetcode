class Solution {
    int[] tree;
    StringBuilder sb;

    void build(int node, int start, int end) {
        if (start == end) {
            tree[node * 3] = 1;
            tree[node * 3 + 1] = 1;
            tree[node * 3 + 2] = 1;
            return;
        }

        int mid = (start + end) / 2;
        build(node * 2, start, mid);
        build(node * 2 + 1, mid + 1, end);
        merge(node, start, mid, end);
    }

    void merge(int node, int start, int mid, int end) {
        int leftNode = node * 2;
        int rightNode = node * 2 + 1;

        int leftCount = tree[leftNode * 3];
        int rightCount = tree[rightNode * 3];
        int leftRightCount = tree[leftNode * 3 + 1];
        int rightRightCount = tree[rightNode * 3 + 1];
        int leftMax = tree[leftNode * 3 + 2];
        int rightMax = tree[rightNode * 3 + 2];

        int newLeft = leftCount;
        int newRight = rightRightCount;
        int newMax = Math.max(leftMax, rightMax);

        if (sb.charAt(mid) == sb.charAt(mid + 1)) {
            newMax = Math.max(newMax, leftRightCount + rightCount);

            if (leftCount == mid - start + 1)
                newLeft = leftCount + rightCount;

            if (rightRightCount == end - mid)
                newRight = leftRightCount + rightRightCount;
        }

        tree[node * 3] = newLeft;
        tree[node * 3 + 1] = newRight;
        tree[node * 3 + 2] = newMax;
    }

    void update(int node, int start, int end, int index) {
        if(start == end){
            tree[node * 3] = 1;
            tree[node * 3 + 1] = 1;
            tree[node * 3 + 2] = 1;
            return;
        }

        int mid = (start + end) / 2;

        if(index <= mid){
            update(node * 2, start, mid, index);
        }
        else{
            update(node * 2 + 1, mid + 1, end, index);
        }

        merge(node, start, mid, end);
    }

    public int[] longestRepeating(String s, String queryCharacters, int[] queryIndices) {
        int n = s.length();
        int k = queryIndices.length;
        sb = new StringBuilder(s);
        tree = new int[4 * n * 3 + 5];

        build(1, 0, n - 1);

        int[] ans = new int[k];

        for(int i = 0; i < k; i++){
            int index = queryIndices[i];
            sb.setCharAt(index, queryCharacters.charAt(i));
            update(1, 0, n - 1, index);
            ans[i] = tree[5];
        }
        return ans;
    }
}