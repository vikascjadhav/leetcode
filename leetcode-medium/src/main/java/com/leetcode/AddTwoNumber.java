package com.leetcode;



public class AddTwoNumber {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public void printList(ListNode result) {
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static void main(String[] args) {
        AddTwoNumber a = new AddTwoNumber();
        ListNode first = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        ListNode second = new ListNode(5, new ListNode(6, new ListNode(4, null)));
        // a.printList(first);
        // a.printList(second);
        ListNode result = a.addTwoNumbers(first, second);
        a.printList(result);


    }

    // Input:l1=[2,4,3],l2=[5,6,4]Output:[7,0,8]Explanation:342+465=807.
    /**
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode pointer = head;
        int carry = 0;
        int val;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;
            val = sum % 10;
            pointer.val = val;

            if (sum >= 10)
                carry = 1;
            else
                carry = 0;
            if (l1.next != null || l2.next != null) {
                pointer.next = new ListNode();
                pointer = pointer.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int sum = l1.val + carry;
            pointer.val = sum % 10;
            if (sum >= 10)
                carry = 1;
            else
                carry = 0;
            if (l1.next != null) {
                pointer.next = new ListNode();
                pointer = pointer.next;
            }
            l1 = l1.next;
        }

        while (l2 != null) {

            int sum = l2.val + carry;
            pointer.val = sum % 10;
            if (sum >= 10)
                carry = 1;
            else
                carry = 0;
            if (l2.next != null) {
                pointer.next = new ListNode();
                pointer = pointer.next;
            }
            l2 = l2.next;
        }
        if (carry == 1) {
            pointer.next = new ListNode();
            pointer = pointer.next;
            pointer.val = 1;
        }

        return head;
    }
}
