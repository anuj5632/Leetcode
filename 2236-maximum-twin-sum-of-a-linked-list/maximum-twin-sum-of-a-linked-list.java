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
    public int pairSum(ListNode head) {
        int maxSum = 0;
        int count = 0;
        ListNode curr = head;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        int[] arr = new int[count];
        int i = 0;
        ListNode curr2 = head;
        while(curr2 != null){
            arr[i] = curr2.val;
            curr2 = curr2.next;
            i++;
        }
        int left = 0;
        int right = count - 1 - left;
        while(left < right){
            int sum = arr[left] + arr[right];
            maxSum = Math.max(sum,maxSum);
            left++;
            right--;
        }
        return maxSum;
    }
}