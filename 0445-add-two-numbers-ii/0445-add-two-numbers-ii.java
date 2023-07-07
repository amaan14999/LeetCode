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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        int sum = 0, carry = 0;
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        ListNode rev1 = reverse(l1);
        ListNode rev2 = reverse(l2);

        while(rev1 != null || rev2 != null){
            int x = rev1 == null ? 0 : rev1.val;
            int y = rev2 == null ? 0 : rev2.val;
            sum = x + y + carry;

            dummy.next = new ListNode(sum % 10);
            dummy = dummy.next;

            carry = sum/10;

            if(rev1 != null ) rev1 = rev1.next;
            if(rev2 != null ) rev2 = rev2.next;
        }

        if(carry>0){
            dummy.next = new ListNode(carry);
        }
        return reverse(temp.next);
    }
    public ListNode reverse(ListNode head){
        ListNode cur = head, prev = null, next = null;
        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
        return head;

    }
}