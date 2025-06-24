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
    public ListNode mergeNodes(ListNode head) {
        int sum = 0;
        ListNode curr = head.next;
        ListNode temp = new ListNode(-1);
        ListNode tail = temp;
        while(curr != null) {
            if(curr.val == 0) {
                if(sum > 0) {
                    tail.next = new ListNode(sum);
                    tail = tail.next;
                    sum=0;
                }
            }
            else {
                sum += curr.val;
            }
            curr = curr.next;
        }
        return temp.next;
    }
}