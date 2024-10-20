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
        if(head.next == null) {
            return true;
        }
        ListNode curr = head;
        int count = 0;
        while(curr != null) {
            count++;
            curr = curr.next;
        }
        int[] arr = new int[count];
        curr = head;
        int i = 0;
        while(count != 0) {
            arr[i] = curr.val;
            curr = curr.next;
            count--;
            i++;

        }
        int start = 0, end = arr.length-1;
        while(start < end) {
            if(arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}