class Solution {
    public int longestCommonPrefix(int[] arr1,int[] arr2){
        HashMap<Integer,Boolean> table=new HashMap<>();

        for(int num:arr1){
            while(num>0){
                table.put(num,true);
                num/=10;
            }
        }
        int maxLen=0;
        for(int num:arr2){
            int temp=num;
            while(temp>0){
                if(table.containsKey(temp)){
                    maxLen=Math.max(maxLen,String.valueOf(temp).length());
                    break;
                }
                temp/=10;
            }
        }

        return maxLen;
    }
}