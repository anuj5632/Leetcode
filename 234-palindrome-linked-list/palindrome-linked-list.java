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
    public boolean isPalindrome(ListNode head) {
        int n = 0;
        ListNode curr = head;
        while(curr != null){
            n++;
            curr = curr.next;
        }

        int[] arr = new int[n];
        int i = 0;
        ListNode curr2 = head;
        while(curr2 != null){
            arr[i] = curr2.val;
            curr2 = curr2.next;
            i++;
        }

        int left = 0;
        int right = n-1;
        while(left < right){
            if(arr[left] != arr[right]){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}