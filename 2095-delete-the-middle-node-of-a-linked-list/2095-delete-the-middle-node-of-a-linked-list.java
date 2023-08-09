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
        ListNode prev = head;
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast !=null && fast.next!=null) {
            prev = slow;
            slow = slow.next;            
            fast = fast.next.next;            
        }
        
        if(prev.next!=null)
            prev.next = prev.next.next;
        else 
            head = null;
        return head;
    }
}