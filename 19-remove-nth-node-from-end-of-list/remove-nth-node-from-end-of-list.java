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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) {
            return head;
        }
        else if(head.next == null) {
            return null;
        }
        ListNode temp = head;
        int count=0;
        while(temp!= null) {
            count++;
            temp = temp.next;
        }
        if(count==n) {
            return head.next;
        }
        count-=n;
        ListNode prev =null;
        ListNode curr = head;
        while(count != 0) {
            prev = curr;
            curr = curr.next;
            count--;
        }
        prev.next = curr.next;
        return head;
    }
}