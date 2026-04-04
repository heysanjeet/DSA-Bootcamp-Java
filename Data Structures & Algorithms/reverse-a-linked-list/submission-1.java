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
    //if the list is empty, return null
    //recursively call the function on head.next to reverse the rest of the list
    //after the resursive call returns:
       //make head.next.next=head so the next node points back to the current node
    //set head.next =null to avoid cycle
    //return the new head return by the deepest resursive call.
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }

        ListNode newHead=head;
        if(head.next !=null){
            newHead=reverseList(head.next);
            head.next.next=head;
        }
        head.next=null;
        return newHead;
        
    }
}
