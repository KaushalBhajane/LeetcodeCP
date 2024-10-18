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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) {
            return head;
        }
        else if(head.next == null) {
            return head;
        }
        int count = 0;
        ListNode temp = head;
        while(temp != null) {
            count++;
            temp = temp.next; 
        }
        
        k = k%count;
        if(k==0) {
            return head;
        }
        count = count-k;

        ListNode prev = null, curr = head;
        while(count != 0) {
            prev = curr;
            curr = curr.next;
            count--;
        }
        prev.next = null;
        ListNode tail = curr;
        while(tail.next != null) {
            tail = tail.next;
        }
        tail.next = head;
        return curr;
    }
}