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
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode head = new ListNode(-1);
        ListNode tail = head;
        int carry=0, sum=-1;
        while(curr1 != null && curr2 != null) {
            sum = curr1.val + curr2.val + carry;
            tail.next = new ListNode(sum%10);
            curr1 = curr1.next;
            curr2 = curr2.next;
            tail = tail.next;
            carry = sum/10;
        }
        while(curr1 != null) {
            sum = curr1.val + carry;
            tail.next = new ListNode(sum%10);
            curr1=curr1.next;
            tail = tail.next;
            carry = sum/10;
        }
        while(curr2 != null) {
            sum = curr2.val + carry;
            tail.next = new ListNode(sum%10);
            curr2=curr2.next;
            tail = tail.next;
            carry = sum/10;
        }
        while(carry != 0) {
            tail.next = new ListNode(carry%10);
            tail = tail.next;
            carry = carry/10;
        }
        
        return head.next;
    }
    
}