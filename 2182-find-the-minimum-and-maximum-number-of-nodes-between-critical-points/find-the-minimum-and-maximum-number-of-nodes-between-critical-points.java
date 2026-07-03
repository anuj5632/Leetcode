class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();

        ListNode prev = head;
        ListNode curr = head.next;
        int index = 1;

        while(curr != null && curr.next != null){
            if((curr.val > prev.val && curr.val > curr.next.val) ||
                (curr.val < prev.val && curr.val < curr.next.val)){
                list.add(index);
            }

            prev = curr;
            curr = curr.next;
            index++;
        }

        if(list.size() < 2){
            return new int[]{-1, -1};
        }

        int minDist = Integer.MAX_VALUE;

        for(int i = 1; i < list.size(); i++){
            minDist = Math.min(minDist, list.get(i) - list.get(i - 1));
        }

        int maxDist = list.get(list.size() - 1) - list.get(0);

        return new int[]{minDist, maxDist};
    }
}