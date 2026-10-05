class Solution {
    public int minimumCardPickup(int[] cards) {
        int left=0;
        int right=0;
        int minLen = cards.length+1;
        HashSet<Integer> set = new HashSet<>();
        while(right<cards.length){
            if(set.contains(cards[right])){
                while(cards[left]!= cards[right]){
                    set.remove(cards[left]);
                    left++;
                    
                }

                minLen = Math.min(minLen , right-left+1);
                left++;
            }else{
                set.add(cards[right]);
            }
            right++;
        }
        if(minLen == cards.length+1){
            return -1;
        }
        else{
            return minLen;
        }

    }
}