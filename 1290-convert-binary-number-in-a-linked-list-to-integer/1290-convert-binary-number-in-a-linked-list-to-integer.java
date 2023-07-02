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
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int len = 0;
        int sum = 0;
        while(temp!=null) {
            len++;
            temp=temp.next;
        }
        for(int i = len-1; i >= 0; i--){
            sum += head.val * Math.pow(2, i);
            head=head.next;
        }
        return sum;
    }
}