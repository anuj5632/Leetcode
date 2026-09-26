class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        int n = s.length();
        HashMap<String,String> map = new HashMap<>();
        for(var k : knowledge){
            map.put(k.get(0),k.get(1));
        }

        StringBuilder ans = new StringBuilder();
        for(int i = 0;i<n;i++){
            if(s.charAt(i) == '('){
                int j = s.indexOf(")",i+1);
                ans.append(map.getOrDefault(s.substring(i+1,j),"?"));
                i = j;
            }
            else{
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }
}