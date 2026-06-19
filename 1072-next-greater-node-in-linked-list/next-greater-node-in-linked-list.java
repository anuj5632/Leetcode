class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list = new ArrayList<>();

        while(head != null){
            list.add(head.val);
            head = head.next;
        }

        int n = list.size();
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && list.get(st.peek()) < list.get(i)){
                ans[st.pop()] = list.get(i);
            }
            st.push(i);
        }
        return ans;
    }
}