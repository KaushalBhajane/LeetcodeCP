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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newNode = new ListNode(0);
        ListNode temp = newNode;
        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
                temp.next = null;
            }
            else {
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
                temp.next = null;
            }
        }
        if(list1 != null) {
            temp.next = list1;
        }
        else {
            temp.next = list2;
        }
    return newNode.next;
    }
}