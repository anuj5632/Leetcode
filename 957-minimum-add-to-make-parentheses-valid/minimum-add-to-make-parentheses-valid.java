class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i = 0;i<n;i++){
            if(s.charAt(i) == '('){
                st.push(s.charAt(i));
            }
            else{
                if(!st.isEmpty() && st.peek() == '('){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }
        }
        int count = 0;
        while(!st.isEmpty()){
            st.pop();
            count++;
        }
        return count;
    }
}