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
        ListNode temp = head;
        int count=0;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        int mid = count/2;
        ListNode curr = head;
        for(int i=0; i<mid; i++) {
            curr = curr.next;
        }
        if(count%2 == 1) {
            curr = curr.next;
        }
        ListNode prev = null;
        ListNode next = null;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode first = head;
        ListNode second = prev;
        while(first != null && second != null) {
            if(first.val != second.val) {
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    }
}