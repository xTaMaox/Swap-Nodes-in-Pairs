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
    public ListNode swapPairs(ListNode head) {
        ListNode d = new ListNode(0);
        d.next = head;
        ListNode p = d;
        ListNode c = d.next;
        while(c!=null){
            ListNode cn = c.next;
            if(cn==null){
                break;
            }
            c.next = cn.next;
            cn.next=p.next;
            p.next = cn;
            p = c;
            c = c.next;
        }
        return d.next;
    }
}