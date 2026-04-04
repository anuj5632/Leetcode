class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        String orig = "";
        int n = encodedText.length();
        int cols = n/rows;
        if(rows <= 1){
            return encodedText;
        }
        StringBuilder sb = new StringBuilder();
        for(int c = 0;c < cols;c++){
            int i = 0;
            int j = c;
            while( i < rows && j < cols){
                sb.append(encodedText.charAt(i*cols + j));
                i++;
                j++;
            }
        }
        int z = sb.length() - 1;
        while(z >= 0 && sb.charAt(z) == ' '){
            z--;
        }
        return sb.substring(0,z+1);       
    }
}