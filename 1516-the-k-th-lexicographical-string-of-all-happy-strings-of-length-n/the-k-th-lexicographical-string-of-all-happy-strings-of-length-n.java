class Solution {

    public String getHappyString(int n, int k) {
        List<String> list = new ArrayList<>();
        generate("", n, list);

        if(k > list.size()){
            return "";
        }
        return list.get(k-1);
    }

    private void generate(String s, int n, List<String> list){
        if(s.length() == n){
            list.add(s);
            return;
        }
        for(char c : new char[]{'a','b','c'}){
            if(s.length() == 0 || s.charAt(s.length()-1) != c){
                generate(s + c, n, list);
            }
        }
    }
}