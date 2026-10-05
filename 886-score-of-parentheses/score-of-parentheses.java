class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        int n = s.length();
        //int score = 0;
        for(int i = 0;i<n;i++){
            if(s.charAt(i) == '('){
                st.push(0);
            }
            else{
                int curr = st.pop();
                st.push(st.pop() + Math.max(1,2*curr));
            }
        }
        return st.peek();
    }
}