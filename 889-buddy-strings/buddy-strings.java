class Solution {
    public boolean buddyStrings(String s, String goal) {
        int n = s.length();
        int m = goal.length();
        if(n != m){
            return false;
        }
        if(s.equals(goal)){
            HashSet<Character> temp = new HashSet<>();
            for(char c : s.toCharArray()){
                temp.add(c);
            }
            if(temp.size() < m){
                return true;
            }
            else{
                return false;
            }
        }

        int i = 0;
        int j = n-1;

        while(i < j && s.charAt(i) == goal.charAt(i)){
            i++;
        }
        while(j >= 0 && s.charAt(j) == goal.charAt(j)){
            j--;
        }

        if(i < j){
            char[] arr = s.toCharArray();
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            s = new String(arr);
        }

        return s.equals(goal);
    }
}