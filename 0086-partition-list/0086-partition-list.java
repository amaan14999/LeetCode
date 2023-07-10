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
    public ListNode partition(ListNode head, int x) {
        ListNode temp = head;
        ListNode part1 = new ListNode();
        ListNode part2 = new ListNode();
        ListNode p1 = part1;
        ListNode p2 = part2;
        while(temp != null){
            if(temp.val < x){
                ListNode node = new ListNode(temp.val);
                p1.next = node;
                p1 = p1.next;
            }
            else{
                ListNode node = new ListNode(temp.val);
                p2.next = node;
                p2 = p2.next;
            }
            temp = temp.next;
        }
        p2.next = null;
        p1.next = part2.next;
        
        return part1.next;
    }
}