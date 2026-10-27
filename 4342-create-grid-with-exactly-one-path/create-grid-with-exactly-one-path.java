class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans= new String[m];
        
        char[] ch= new char[n];
        ch[0]='.';
        for(int i=1;i<n;i++){
            ch[i]='#';
        }
        String ch1=new String(ch);

        for(int i=0;i<m-1;i++){
            ans[i]=ch1;
        }
        for(int i=1;i<n;i++){
            ch[i]='.';
        }
        ans[m-1]=new String(ch);

        return ans;      
    }
}