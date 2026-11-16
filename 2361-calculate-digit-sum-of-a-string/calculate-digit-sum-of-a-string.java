class Solution {
    public String digitSum(String s, int k) {
       int n = s.length();
       if(n < k){
        return s;
       }
       while(n > k){
        StringBuilder ans = new StringBuilder();
        for(int i = 0;i<n;i+=k){
            int sum = 0;
            for(int j = i;j<i+k && j<n;j++){
                int digit = s.charAt(j) - '0';
                sum += digit;
            }
            ans.append(sum);
        }
        s = ans.toString();
        n = s.length();

       }
       return s;
    }
}