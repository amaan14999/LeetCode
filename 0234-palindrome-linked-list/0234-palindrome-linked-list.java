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
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        slow.next=reverse(slow.next);
        slow=slow.next;
        fast=head;
        while(slow!=null)
        {
            if(fast.val!=slow.val)
            {
                return false;
            }
            fast=fast.next;
            slow=slow.next;
        }
        return true;
    }
    public ListNode reverse(ListNode node)
    {
        ListNode prev=null;
        ListNode next=null;
        ListNode cur=node;
        while(cur!=null)
        {
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        node=prev;
        return node;
    }
}
