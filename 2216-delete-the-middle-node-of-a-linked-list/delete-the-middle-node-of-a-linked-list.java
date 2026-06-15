/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        int n = 0;
        ListNode curr = head;
        while(curr != null){
            n++;
            curr = curr.next;
        }
        int middle = n/2;
        ListNode curr2 = head;
        for(int i = 0;i<middle-1;i++){
            curr2 = curr2.next;
        }
        curr2.next = curr2.next.next;
        return head;
    }
}