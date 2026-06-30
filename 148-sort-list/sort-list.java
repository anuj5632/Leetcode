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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode mid = getMid(head);
        ListNode right = mid.next;
        mid.next = null;

        ListNode left = sortList(head);
        right = sortList(right);

        return merge(left,right);
    }

    public ListNode getMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode merge(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(a != null && b != null){
            if(a.val <= b.val){
                curr.next = a;
                a = a.next;
            }
            else{
                curr.next = b;
                b = b.next;
            }

            curr = curr.next;
        }

        if(a != null){
            curr.next = a;
        }
        else{
            curr.next = b;
        }

        return dummy.next;
    }
}