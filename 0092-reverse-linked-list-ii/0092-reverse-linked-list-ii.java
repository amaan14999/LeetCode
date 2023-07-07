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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur1 = dummy, prev1 = null;
        for(int i = 0; i < left; i++){
            prev1 = cur1;
            cur1 = cur1.next;
        }
        ListNode cur2 = cur1;
        ListNode prev2 = prev1;
        ListNode next = null;
        for(int i = left; i <= right; i++){
            next = cur2.next;
            cur2.next = prev2;
            prev2 = cur2;
            cur2 = next;
        }
        cur1.next = cur2;
        prev1.next = prev2;

        return dummy.next;
    }
}