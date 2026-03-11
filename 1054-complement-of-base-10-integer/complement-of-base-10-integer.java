class Solution {
    public int bitwiseComplement(int n) {
        String s = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '0'){
                sb.setCharAt(i,'1');
            }
            else{
                sb.setCharAt(i,'0');
            }
        }
        String comp = sb.toString();
        int decimal = Integer.parseInt(comp,2);

        return decimal;
    }
}