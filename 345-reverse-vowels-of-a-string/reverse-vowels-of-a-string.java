class Solution {
    public boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'|| c == 'I'
        || c == 'A' || c == 'O' || c == 'U' || c == 'E'){
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        int n = s.length();
        int left = 0;
        int right = n-1;
        char[] arr = s.toCharArray();
        while(left < right){
            if(!isVowel(arr[left])){
                left++;
            }
            else if(!isVowel(arr[right])){
                right--;
            }
            else{
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
            }
        }
        String ans = new String(arr);
        return ans;
    }
}