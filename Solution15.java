/**
 * 206. Reverse Linked List
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 */


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
    //1 -> 2
    //2 -> 1
    //3 -> 2 -> 1
    //4 -> 3 -> 2 -> 1
    //5 -> 4 -> 3 -> 2 -> 1
    public ListNode reverseNode(ListNode head, ListNode current) {
        ListNode nextNode = head.next;
        if(nextNode != null) {
            ListNode node = new ListNode(nextNode.val, current);
            return reverseNode(nextNode, node);
        }
        return current;
    }

    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return null;
        }
        return reverseNode(head, new ListNode(head.val));
    }
}